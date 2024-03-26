package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller.dto.request.CreatePersonRequestDto
import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper.CreatePersonRequestMapper
import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper.PersonResponseDtoMapper
import com.github.gmsdev04.springwebfluxpersonpocapi.usecases.CreatePersonUseCase
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController(
    private val createPersonUseCase: CreatePersonUseCase,
    private val createPersonMapper: CreatePersonRequestMapper,
    private val personResponseDtoMapper: PersonResponseDtoMapper
)  {

    @PostMapping
    fun createPerson(@Valid @RequestBody body: CreatePersonRequestDto) =
        createPersonUseCase.createPerson(
            createPersonMapper.toDomain(body)
        ).map(personResponseDtoMapper::fromDomain)
}