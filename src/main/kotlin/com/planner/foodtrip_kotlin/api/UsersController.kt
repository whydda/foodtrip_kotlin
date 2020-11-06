package com.planner.foodtrip_kotlin.api

import com.planner.foodtrip_kotlin.domain.user.service.UsersService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by whydda on 11월, 2020
 */
@RestController
class UsersController (val usersService: UsersService){

    companion object {
        val logger: Logger = LoggerFactory.getLogger(this::class.java)
    }
    @GetMapping("/")
    fun get(): ResponseEntity<Any> {
        return ResponseEntity.ok().build()
    }

    @GetMapping("/user/{email}")
    fun get(@PathVariable email: String): ResponseEntity<Any> {
        val user = usersService.findByEmail(email)
        return ResponseEntity.ok().body(user)
    }

}