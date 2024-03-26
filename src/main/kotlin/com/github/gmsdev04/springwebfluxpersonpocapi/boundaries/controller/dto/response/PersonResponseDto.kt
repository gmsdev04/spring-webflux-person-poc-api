package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller.dto.response

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Home
import reactor.core.publisher.Flux

data class PersonResponseDto(
    val id: Long?,
    val name: String,
    val email: String,
    val homes: List<Home>
)
