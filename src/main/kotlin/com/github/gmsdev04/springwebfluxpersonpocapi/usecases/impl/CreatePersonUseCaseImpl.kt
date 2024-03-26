package com.github.gmsdev04.springwebfluxpersonpocapi.usecases.impl

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import com.github.gmsdev04.springwebfluxpersonpocapi.repository.PersonRepository
import com.github.gmsdev04.springwebfluxpersonpocapi.usecases.CreatePersonUseCase
import org.springframework.stereotype.Service

@Service
class CreatePersonUseCaseImpl(
    private val personRepository: PersonRepository
) : CreatePersonUseCase {

    override fun createPerson(person: Person) =
        personRepository.createPerson(person)

}