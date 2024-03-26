package com.github.gmsdev04.springwebfluxpersonpocapi.gateways

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Home
import reactor.core.publisher.Flux

interface HomesGateway {
    fun findAllHomes() : Flux<Home>
}