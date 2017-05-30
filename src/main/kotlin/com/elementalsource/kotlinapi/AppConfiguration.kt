package com.elementalsource.kotlinapi

import org.glassfish.jersey.server.ResourceConfig
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

/**
 * Created by Kleber.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
open class AppConfiguration {

    @Component
    open class JerseyConfig() : ResourceConfig() {
        // Bloco de inicializacao, para codigos que ficariam nos contrutores primarios do Java
        // Construtores primarios nao podem ter codigo
        init {
            //this.register(PessoaAPI::class.java)
            this.packages("com.elemental-source")
        }
    }

    @Bean
    open fun restTemplate(): RestTemplate {
        val restTemplate = RestTemplate()
        return restTemplate
    }
}
