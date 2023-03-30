package com.bread.realworld.dto

import com.bread.realworld.domain.User

data class UserResponseDto(
    val user: UserDto
) {
    data class UserDto(
        val email: String,
        val token: String?,
        val username: String,
        val bio: String?,
        val image: String? = null
    )

    companion object {
        fun mapToDto(user: User): UserResponseDto {
            return UserResponseDto(
                UserDto(
                    email = user.email,
                    token = user.token,
                    username = user.username,
                    bio = user.bio,
                    image = user.image
                )
            )
        }
    }
}

data class CreateUserRequestDto(
    val user: UserDto
) {

    data class UserDto(
        val username: String,
        val email: String,
        val password: String
    )

    fun toEntity(): User {
        return User(
            username = this.user.username,
            email = this.user.email,
            password = this.user.password
        )
    }
}
