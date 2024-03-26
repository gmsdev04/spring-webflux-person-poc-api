package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.entities.PersonEntity
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.stereotype.Service


@Service
class PersonMapper {

    fun mapToDomain(entity: PersonEntity) =
        object : Person {
            override val id: Long? = entity.id
            override val name: String = entity.name
            override val email: String = entity.email
        }

    fun mapToEntity(person: Person) =
        PersonEntity(
            person.id,
            person.name,
            person.email
        )

}