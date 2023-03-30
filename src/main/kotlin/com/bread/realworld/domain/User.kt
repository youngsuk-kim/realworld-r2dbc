package com.bread.realworld.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table(name = "users")
class User (
    @Id
    var id: Long? = null,
    val token: String? = null,
    val username: String,
    val password: String,
    val email: String,
    val bio: String? = null,
    val image: String? = null
)