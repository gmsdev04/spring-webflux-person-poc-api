package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.dal.PersonRepositoryMySqlDao
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.mapper.PersonMapper
import com.github.gmsdev04.springwebfluxpersonpocapi.repository.PersonRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class PersonRepositoryImpl(
    private val personRepositoryMySqlDao: PersonRepositoryMySqlDao,
    private val personMapper: PersonMapper
) : PersonRepository {
    override fun createPerson(person: Person) =
        personRepositoryMySqlDao
            .save(personMapper.mapToEntity(person))
            .map(personMapper::mapToDomain)

}