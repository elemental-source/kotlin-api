package com.elementalsource.kotlinapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by Kleber.
 */
@SpringBootApplication
open class App {

}

fun main(args: Array<String>) {
    // * spread operator antes do array (insere conteudo do array no vararg da funcao run)
    SpringApplication.run(App::class.java, *args)
}
