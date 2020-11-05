package com.planner.foodtrip_kotlin.domain.user.service

import com.planner.foodtrip_kotlin.domain.user.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by whydda on 11월, 2020
 */
@Service
class UserService(
        val userRepository: UserRepository
) {
    @Transactional(readOnly = true)
    fun findByEmail(email: String) = userRepository.findByEmail(email);
}