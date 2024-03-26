package com.github.gmsdev04.springwebfluxpersonpocapi.repository

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import reactor.core.publisher.Mono

interface PersonRepository {
    fun createPerson(person: Person) : Mono<Person>
    fun findById(id: Long): Mono<Person>

}