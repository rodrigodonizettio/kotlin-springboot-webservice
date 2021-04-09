package com.rodrigodonizettio.restfulwebservice.controller

import com.rodrigodonizettio.restfulwebservice.model.Message
import com.rodrigodonizettio.restfulwebservice.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(val service: MessageService) {
    @GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }

    @PutMapping
    fun update(@RequestBody message: Message) {
        service.update(message)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long?) {
        service.delete(id)
    }
}