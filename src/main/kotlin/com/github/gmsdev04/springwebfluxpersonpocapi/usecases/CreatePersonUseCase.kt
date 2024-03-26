package com.github.gmsdev04.springwebfluxpersonpocapi.usecases

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import reactor.core.publisher.Mono

interface CreatePersonUseCase {
    fun createPerson(person: Person) : Mono<Person>
}