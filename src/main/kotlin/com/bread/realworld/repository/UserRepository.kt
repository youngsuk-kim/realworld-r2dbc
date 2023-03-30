package com.bread.realworld.repository

import com.bread.realworld.domain.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository: CoroutineCrudRepository<User, Long> {
}