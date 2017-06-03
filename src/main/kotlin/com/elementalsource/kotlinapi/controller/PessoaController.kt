package com.elementalsource.kotlinapi.controller


/**
 * Created by Kleber.
 */
/*
@RestController
@RequestMapping("/pessoas")
class PessoaController {

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
        var pessoa: Pessoa = Pessoa(nome = "Kleber", email = "kleber@email.com")
        return pessoa
    }

    @GetMapping(value = "/getPessoaMono", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun getPessoaMono(): Mono<Pessoa> {
        var pessoa: Pessoa = Pessoa(nome = "Kleber", email = "kleber@email.com")
        return pessoa.toMono()
    }
}
*/
