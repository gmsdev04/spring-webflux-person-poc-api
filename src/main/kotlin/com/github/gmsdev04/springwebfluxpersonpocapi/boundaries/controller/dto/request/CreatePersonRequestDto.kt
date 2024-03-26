package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries.controller.dto.request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length


class CreatePersonRequestDto {

    @NotNull(message = "O campo nome não pode ser nulo")
    @NotBlank(message = "O campo nome não pode ser vazio")
    @Length(message = "O campo nome deve ter no minimo 3 caracteres", min = 3)
    var name: String? = null

    @Email(message = "O campo email deve ser um email válido")
    var email: String? = null
}