package com.bread.realworld.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "users")
class User (
    @Id
    val id: Long,
    val token: String,
    val username: String,
    val bio: String,
    val image: String
)