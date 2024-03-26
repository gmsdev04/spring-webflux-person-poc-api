package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.entities.PersonEntity
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Home
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux


@Service
class PersonMapper {

    fun mapToDomain(entity: PersonEntity) =
        Person(
            entity.id,
            entity.name,
            entity.email,
            listOf()
        )

    fun mapToEntity(person: Person) =
        PersonEntity(
            person.id,
            person.name,
            person.email
        )

}