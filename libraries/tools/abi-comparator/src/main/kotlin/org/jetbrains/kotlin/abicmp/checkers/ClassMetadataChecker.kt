/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.abicmp.checkers

import kotlinx.metadata.jvm.KotlinClassMetadata
import org.jetbrains.kotlin.abicmp.reports.ClassMetadataReport

interface ClassMetadataChecker : Checker {
    fun check(metadata1: KotlinClassMetadata.Class, metadata2: KotlinClassMetadata.Class, report: ClassMetadataReport)
}