package com.bread.realworld.service

import com.bread.realworld.dto.CreateUserRequestDto
import com.bread.realworld.dto.UserResponseDto
import com.bread.realworld.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    suspend fun createUser(createUserRequestDto: CreateUserRequestDto): UserResponseDto {
        val user = userRepository.save(createUserRequestDto.toEntity())
        return UserResponseDto.mapToDto(user)
    }
}