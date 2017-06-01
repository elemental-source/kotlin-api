package com.elementalsource.kotlinapi

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Configuration


/**
 * Created by Kleber.
 */
@Configuration
open class AppConfiguration: ResourceConfig() {

    init {
        this.packages("com.elementalsource.kotlinapi")
    }
}
