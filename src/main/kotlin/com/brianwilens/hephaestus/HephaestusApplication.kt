package com.brianwilens.hephaestus

import org.flywaydb.core.Flyway
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HephaestusApplication

fun main(args: Array<String>) {
    runApplication<HephaestusApplication>(*args)
}
