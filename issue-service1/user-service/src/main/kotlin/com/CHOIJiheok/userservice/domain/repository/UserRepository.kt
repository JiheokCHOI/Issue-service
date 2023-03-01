package com.CHOIJiheok.userservice.domain.repository

import com.CHOIJiheok.userservice.domain.entity.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository : CoroutineCrudRepository<User, Long> {

    suspend fun findByEmail(email: String): User?
}