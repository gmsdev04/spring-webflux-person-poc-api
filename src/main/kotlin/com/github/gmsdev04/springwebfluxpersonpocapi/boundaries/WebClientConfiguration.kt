package com.github.gmsdev04.springwebfluxpersonpocapi.boundaries

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration(
    @Value("\${gateways.home-api.base-uri}")
    private val homeApiBaseUri: String,
) {

    @Bean
    fun homeWebClient() = WebClient.builder().baseUrl(homeApiBaseUri).build()

}