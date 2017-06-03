package com.elementalsource.kotlinapi

import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.web.client.RestTemplate

/**
 * Created by Kleber.
 */
@SpringBootApplication
open class App {

    /*@Bean
    open fun restTemplate(): RestTemplate {
        val restTemplate = RestTemplate()
        return restTemplate
    }*/

    @Bean
    open fun objectMapperBuilder(): Jackson2ObjectMapperBuilder = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule())

}

fun main(args: Array<String>) {
    // * spread operator antes do array (insere conteudo do array no vararg da funcao run)
    SpringApplication.run(App::class.java, *args)
}
