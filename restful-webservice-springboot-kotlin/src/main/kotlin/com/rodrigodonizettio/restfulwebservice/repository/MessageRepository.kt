package com.rodrigodonizettio.restfulwebservice.repository

import com.rodrigodonizettio.restfulwebservice.model.Message
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface MessageRepository : CrudRepository<Message, Long> {
    @Query("select * from message")
    fun findMessages(): List<Message>

    @Modifying
    @Query("update message m set m.text = :text where m.id = :id")
    fun updateMessage(@Param(value = "id")id: Long?, @Param(value = "text")text: String)
}