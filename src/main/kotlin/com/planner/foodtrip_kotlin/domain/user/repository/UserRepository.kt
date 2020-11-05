package com.planner.foodtrip_kotlin.domain.user.repository

import com.planner.foodtrip_kotlin.domain.user.data.User
import org.springframework.data.repository.CrudRepository

/**
 * Created by whydda on 11월, 2020
 */
interface UserRepository : CrudRepository<User, Long> {
    fun findByEmail(email: String): User?
}