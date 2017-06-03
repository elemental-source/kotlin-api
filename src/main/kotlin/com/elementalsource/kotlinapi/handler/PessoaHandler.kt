package com.elementalsource.kotlinapi.handler

import org.reactivestreams.Publisher
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.fromPublisher
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok

/**
 * Created by Kleber.
 */
@Component
class PessoaHandler() {

    fun olaFuncionalReativo(serverRequest: ServerRequest) = ok().body(fromPublisher<Publisher<String>, String>(Publisher { "Ola" }))
}
