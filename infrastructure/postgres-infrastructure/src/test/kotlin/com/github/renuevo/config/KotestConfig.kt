package com.github.renuevo.config

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.extensions.spring.SpringExtension

@Suppress("unused")
object KotestConfig : AbstractProjectConfig() {
    override fun extensions(): List<Extension>  = listOf(SpringExtension)
}
