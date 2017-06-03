package com.elementalsource.kotlinapi.route

import com.elementalsource.kotlinapi.handler.PessoaHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.toMono

/**
 * Created by Kleber.
 */
@Configuration
open class ApiRoute(val pessoaHandler: PessoaHandler) {

    @Bean
    open fun apiRouter() = router {
       /* (accept(APPLICATION_JSON) and "/api").nest {
            "/pessoa".nest {
                GET("/olaFuncionalReativo", pessoaHandler::olaFuncionalReativo)
            }
        }*/

        ("/api/pessoa" and accept(APPLICATION_JSON)).nest {
            GET("/olaFuncionalReativo", pessoaHandler::olaFuncionalReativo)
        }
    }
}
