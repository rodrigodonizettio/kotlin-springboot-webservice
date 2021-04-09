package com.rodrigodonizettio.restfulwebservice.service

import com.rodrigodonizettio.restfulwebservice.model.Message
import com.rodrigodonizettio.restfulwebservice.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }

    fun update(message: Message) {
        db.updateMessage(message.id, message.text)
    }

    fun delete(id: Long?) {
        id?.let { db.deleteById(it) }
    }
}