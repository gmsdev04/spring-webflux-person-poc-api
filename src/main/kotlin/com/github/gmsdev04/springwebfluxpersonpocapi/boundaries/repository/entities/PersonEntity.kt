package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.repository.entities

import com.github.gmsdev04.springwebfluxpersonpocapi.domain.Person
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("persons")
class PersonEntity(
    @Id
    override val id: Long?,
    override val name: String,
    override val email: String
) : Person

