package com.github.gmsdev04.springwebfluxpersonpocapi.usecases.impl

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import com.github.gmsdev04.springwebfluxpersonpocapi.gateways.HomesGateway
import com.github.gmsdev04.springwebfluxpersonpocapi.repository.PersonRepository
import com.github.gmsdev04.springwebfluxpersonpocapi.usecases.GetPersonByIdUseCase
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux.defer
import reactor.core.publisher.Mono

@Service
class GetPersonByIdUseCaseImpl(
    private val personRepository: PersonRepository,
    private val homesGateway: HomesGateway
) : GetPersonByIdUseCase {
    override fun getPerson(id: Long): Mono<Person> {

        return personRepository.findById(id)
            .flatMap { person ->
                homesGateway.findAllHomes()
                    .collectList()
                    .doOnNext { homes -> person.homes = homes }
                    .thenReturn(person)
            }
    }
}