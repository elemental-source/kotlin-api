package com.elementalsource.kotlinapi.api

import com.elementalsource.kotlinapi.Pessoa
import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

/**
 * Created by Kleber.
 */
@Component
@Path("/pessoa")
class PessoaAPI {

    @GET
    @Path("/ola")
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(@QueryParam("nome") nome: String): String {
        return "Olá, $nome"
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    fun getPessoa(): Pessoa {
        var pessoa: Pessoa = Pessoa()
        pessoa.nome = "Kleber"
        pessoa.email = "kleber@email.com"
        return pessoa
    }
}
