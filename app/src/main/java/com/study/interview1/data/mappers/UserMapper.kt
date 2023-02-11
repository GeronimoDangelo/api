package com.study.interview1.data.mappers

import com.study.interview1.data.remote.response.ResultDto
import com.study.interview1.domain.model.User

fun ResultDto.toDomain(): User {
    return User(
        name = "${this.nameDto.first} ${this.nameDto.last}",
        email = this.email,
        birthday = this.dobDto.date,
        age = this.dobDto.age,
        address = this.locationDto.country,
        phoneNumber = this.phone,
        password = this.loginDto.password
    )
}