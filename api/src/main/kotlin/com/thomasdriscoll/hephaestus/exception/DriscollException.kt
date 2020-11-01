package com.thomasdriscoll.hephaestus.exception

import org.springframework.http.HttpStatus

class DriscollException(
        val status: HttpStatus,
        val error: DriscollError,
        message: String
) : Exception(message)