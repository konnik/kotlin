/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.utils

import org.gradle.api.logging.Logger
import kotlin.concurrent.thread

/**
 * Executes a command and returns the input text.
 *
 * @param command the command and its arguments to be executed as a list of strings.
 * @param logger an optional logger to log information about the command execution.
 * @param errorHandler (Optional) A function that handles any errors that occur during the command execution.
 * @param processConfiguration a function to configure the process before execution.
 * @return The input text of the executed command.
 */
internal fun runCommand(
    command: List<String>,
    logger: Logger? = null,
    errorHandler: ((retCode: Int, output: String, process: Process) -> String?)? = null,
    processConfiguration: ProcessBuilder.() -> Unit = { },
): String {
    val runResult = assembleAndRunProcess(command, logger, processConfiguration)
    check(runResult.retCode == 0) {
        errorHandler?.invoke(runResult.retCode, runResult.output, runResult.process) ?: createErrorMessage(command, runResult)
    }

    return runResult.inputText
}

/**
 * Sealed class representing the fallback behavior for a command.
 */
sealed class CommandFallback {
    data class Action(val fallback: String) : CommandFallback()
    data class Error(val error: String?) : CommandFallback()
}

/**
 * Executes the specified command with fallback behavior in case of non-zero return code.
 *
 * @param command the command and its arguments to be executed as a list of strings.
 * @param logger an optional logger to log information about the command execution.
 * @param fallback a function that provides the fallback behavior. It takes the return code, output, and process as parameters and returns a [CommandFallback] object.
 * @param processConfiguration a function to configure the process before execution.
 * @return the output of the command if the return code is 0, otherwise the fallback action or error.
 */
internal fun runCommandWithFallback(
    command: List<String>,
    logger: Logger? = null,
    fallback: (retCode: Int, output: String, process: Process) -> CommandFallback,
    processConfiguration: ProcessBuilder.() -> Unit = { },
): String {
    val runResult = assembleAndRunProcess(command, logger, processConfiguration)
    return if (runResult.retCode != 0) {
        when (val fallbackOption = fallback(runResult.retCode, runResult.output, runResult.process)) {
            is CommandFallback.Action -> fallbackOption.fallback
            is CommandFallback.Error -> error(fallbackOption.error ?: createErrorMessage(command, runResult))
        }
    } else {
        runResult.inputText
    }
}

private data class RunProcessResult(
    val inputText: String,
    val errorText: String,
    val retCode: Int,
    val process: Process,
) {
    val output: String get() = inputText.ifBlank { errorText }
}

private fun assembleAndRunProcess(
    command: List<String>,
    logger: Logger? = null,
    processConfiguration: ProcessBuilder.() -> Unit = { },
): RunProcessResult {

    val process = ProcessBuilder(command).apply {
        this.processConfiguration()
    }.start()

    var inputText = ""
    var errorText = ""

    val inputThread = thread {
        inputText = process.inputStream.use {
            it.reader().readText()
        }
    }

    val errorThread = thread {
        errorText = process.errorStream.use {
            it.reader().readText()
        }
    }

    inputThread.join()
    errorThread.join()

    val retCode = process.waitFor()
    logger?.info(
        """
            |Information about "${command.joinToString(" ")}" call:
            |
            |${inputText}
        """.trimMargin()
    )

    return RunProcessResult(inputText, errorText, retCode, process)
}

private fun createErrorMessage(command: List<String>, runResult: RunProcessResult): String {
    return """
           |Executing of '${command.joinToString(" ")}' failed with code ${runResult.retCode} and message: 
           |
           |${runResult.inputText}
           |
           |${runResult.errorText}
           |
           """.trimMargin()
}