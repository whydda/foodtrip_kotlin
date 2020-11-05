package com.planner.foodtrip_kotlin.domain.user.data

import com.planner.foodtrip_kotlin.domain.data.CommonTime
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.sql.Timestamp
import java.time.LocalDate
import java.time.ZonedDateTime

/**
 * Created by whydda on 11월, 2020
 */
@Table("users")
data class User(@Id override val id: Long,
                val password : String,
                val email : String,
                val name : String,
                val authorization : String,
                override val createdAt: Timestamp,
                override var updatedAt: Timestamp?,
                override var deletedAt: Timestamp?) : CommonTime {

}
