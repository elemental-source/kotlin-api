package com.elementalsource.kotlinapi.rest

import com.elementalsource.kotlinapi.model.Pessoa
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.ws.rs.QueryParam


/**
 * Created by Kleber.
 */
@RestController
@RequestMapping("/pessoas")
class PessoaREST {

    @GetMapping("/ola", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun hello(@QueryParam("nome") nome: String): String {
        return "Olá, $nome"
    }

    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET), produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun getPessoa(): Pessoa {
        var pessoa: Pessoa = Pessoa()
        pessoa.nome = "Kleber"
        pessoa.email = "kleber@email.com"
        return pessoa
    }
}
