package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.gateways

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Home
import com.github.gmsdev04.springwebfluxpersonpocapi.gateways.HomesGateway
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux

@Service
class HomeGatewayImpl(
    private val homeWebClient: WebClient
) : HomesGateway {
    override fun findAllHomes(): Flux<Home> =
        homeWebClient.get()
            .uri("/api/homes")
            .retrieve()
            .bodyToFlux(Home::class.java)
}