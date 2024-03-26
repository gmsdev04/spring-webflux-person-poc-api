package com.github.gmsdev04.springwebfluxpersonpocapi.domain

class Person (
    val id: Long?,
    val name: String,
    val email: String,
    var homes: List<Home>
)
