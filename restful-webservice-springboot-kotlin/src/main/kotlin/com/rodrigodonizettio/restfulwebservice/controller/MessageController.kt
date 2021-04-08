package com.rodrigodonizettio.restfulwebservice.controller

import com.rodrigodonizettio.restfulwebservice.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @GetMapping
    fun index(): List<Message> = listOf(
            Message(1, "Greetings!"),
            Message(2, "Hail!"),
            Message(1, "Hello!"),
    )
}