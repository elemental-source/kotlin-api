package com.elementalsource.kotlinapi.api

import org.springframework.web.bind.annotation.RestController

/**
 * Created by Kleber.
 */
@RestController
class PessoaREST {

    @RequestMapping(value = "/olaREST", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    fun hello(@QueryParam("nome") nome: String): String {
        return "Olá, $nome"
    }

    @RequestMapping(value = "/getPessoaREST", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    fun getPessoa(): Pessoa {
        var pessoa: Pessoa = Pessoa()
        pessoa.nome = "Kleber"
        pessoa.email = "kleber@email.com"
        return pessoa
    }
}
