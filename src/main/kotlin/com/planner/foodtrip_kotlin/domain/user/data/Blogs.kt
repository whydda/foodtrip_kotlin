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
@Table("blogs")
data class Blogs(@Id override val id: Long,
                 var usersId : Long,
                 val title : String,
                 val content : String,
                 val imageId : Long,
                 override val createdAt: Timestamp,
                 override var updatedAt: Timestamp?,
                 override var deletedAt: Timestamp?) : CommonTime {

}
