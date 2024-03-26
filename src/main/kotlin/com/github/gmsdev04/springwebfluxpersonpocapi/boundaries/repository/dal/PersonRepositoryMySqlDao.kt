package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.dal

import com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.entities.PersonEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepositoryMySqlDao : ReactiveCrudRepository<PersonEntity, Long>