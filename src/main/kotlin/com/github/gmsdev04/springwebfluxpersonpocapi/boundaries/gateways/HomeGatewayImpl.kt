package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.gateways

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Home
import com.github.gmsdev04.springwebfluxpersonpocapi.gateways.HomesGateway
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux

@Service
class HomeGatewayImpl(
    private val homeWebClient: WebClient
) : HomesGateway {

    var counter : Int = 0
    @CircuitBreaker(
        name = "findAllHomes",
        fallbackMethod = "findAllHomesFallback"
    )
    override fun findAllHomes(): Flux<Home> {
        return homeWebClient.get()
            .uri("/api/homes")
            .retrieve()
            .bodyToFlux(Home::class.java)
    }
    fun findAllHomesFallback(ex: Throwable): Flux<Home> {
        print("Fallback executed")
        return Flux.just(Home(333, "Casa do abreu"))
    }


}