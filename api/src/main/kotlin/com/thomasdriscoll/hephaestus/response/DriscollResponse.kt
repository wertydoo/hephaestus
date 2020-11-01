package com.thomasdriscoll.hephaestus.response

import com.thomasdriscoll.hephaestus.exception.DriscollError

class DriscollResponse <T> (
        val status: Int,
        val body: T?,
        val error: DriscollError?
)