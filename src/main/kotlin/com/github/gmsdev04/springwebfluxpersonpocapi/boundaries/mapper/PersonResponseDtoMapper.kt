package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller.dto.response.PersonResponseDto
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.stereotype.Service

@Service
class PersonResponseDtoMapper {
    fun fromDomain(person: Person) =
        PersonResponseDto(
            person.id,
            person.name,
            person.email,
            person.homes
        )
}