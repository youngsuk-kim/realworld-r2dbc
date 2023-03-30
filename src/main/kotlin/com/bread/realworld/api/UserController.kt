package com.bread.realworld.api

import com.bread.realworld.dto.CreateUserRequestDto
import com.bread.realworld.dto.UserResponseDto
import com.bread.realworld.service.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {
    @PostMapping("/api/users")
    suspend fun saveUser(@RequestBody createUserRequestDto: CreateUserRequestDto): UserResponseDto {
        return userService.createUser(createUserRequestDto)
    }
}