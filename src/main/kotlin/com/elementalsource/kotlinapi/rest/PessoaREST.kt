package com.elementalsource.kotlinapi.rest

import com.elementalsource.kotlinapi.model.Pessoa
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono
import javax.ws.rs.QueryParam


/**
 * Created by Kleber.
 */
@RestController
@RequestMapping("/pessoas")
class PessoaREST {

    @GetMapping("/ola", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun ola(@QueryParam("nome") nome: String): String {
        return "Olá, $nome"
    }

    @GetMapping("/olaMono", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun olaMono(@QueryParam("nome") nome: String): Mono<String> {
        return "Olá, $nome".toMono()
    }

    @GetMapping("/getPessoa", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun getPessoa(): Pessoa {
        var pessoa: Pessoa = Pessoa()
        pessoa.nome = "Kleber"
        pessoa.email = "kleber@email.com"
        return pessoa
    }

    @GetMapping(value = "/getPessoaMono", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun getPessoaMono(): Mono<Pessoa> {
        var pessoa: Pessoa = Pessoa()
        pessoa.nome = "Kleber"
        pessoa.email = "kleber@email.com"
        return pessoa.toMono()
    }
}
