package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.entities

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Home
import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import reactor.core.publisher.Flux

@Table("persons")
class PersonEntity(
    @Id
    val id: Long?,
    val name: String,
    val email: String,
)

