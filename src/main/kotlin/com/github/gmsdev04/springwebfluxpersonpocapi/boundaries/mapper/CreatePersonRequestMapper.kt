package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller.dto.request.CreatePersonRequestDto
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.stereotype.Service

@Service
class CreatePersonRequestMapper {
    fun toDomain(createPersonRequestDto: CreatePersonRequestDto) =
        object : Person{
            override val id: Long? = null
            override val name: String = createPersonRequestDto.name!!
            override val email: String = createPersonRequestDto.email!!
        }
}