package com.brianwilens.hephaestus

import org.flywaydb.core.Flyway
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HephaestusApplicationConfiguration {
    @Bean
    fun flyway(
        @Value("\${spring.datasource.url}") url : String,
        @Value("\${spring.datasource.username}") username : String,
        @Value("\${spring.datasource.password}") password : String) : Flyway {
        val flyway = Flyway.configure().dataSource(url, username, password).load()
        flyway.migrate()
        return flyway
    }
}