package com.planner.foodtrip_kotlin.domain.user.repository

import com.planner.foodtrip_kotlin.domain.user.data.Blogs
import com.planner.foodtrip_kotlin.domain.user.data.Users
import org.springframework.data.repository.CrudRepository

/**
 * Created by whydda on 11월, 2020
 */
interface BlogsRepository : CrudRepository<Blogs, Long> {
    fun findByUserId(userId:Long)
}