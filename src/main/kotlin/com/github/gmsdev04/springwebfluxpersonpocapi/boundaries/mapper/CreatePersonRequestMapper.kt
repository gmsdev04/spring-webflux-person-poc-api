package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller.dto.request.CreatePersonRequestDto
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.stereotype.Service

@Service
class CreatePersonRequestMapper {
    fun toDomain(createPersonRequestDto: CreatePersonRequestDto) =
        Person(
            id = null,
            createPersonRequestDto.name!!,
            createPersonRequestDto.email!!,
            listOf()
        )
}