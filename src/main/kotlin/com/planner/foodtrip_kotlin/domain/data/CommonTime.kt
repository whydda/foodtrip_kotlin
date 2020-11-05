package com.planner.foodtrip_kotlin.domain.data

import java.sql.Timestamp

/**
 * Created by whydda on 11월, 2020
 */
interface CommonTime{
    val id: Long
    val createdAt: Timestamp
    var updatedAt: Timestamp?
    var deletedAt: Timestamp?
}
