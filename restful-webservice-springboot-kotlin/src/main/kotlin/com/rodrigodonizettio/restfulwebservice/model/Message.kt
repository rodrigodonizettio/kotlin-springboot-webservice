package com.rodrigodonizettio.restfulwebservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGE")
data class Message(@Id val id: Long?, val text: String) {

}