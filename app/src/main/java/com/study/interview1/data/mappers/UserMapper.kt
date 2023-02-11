package com.study.interview1.data.mappers

import com.study.interview1.data.remote.response.Result
import com.study.interview1.domain.model.User

fun Result.toDomain(): User {
    return User(
        name = "${this.name.first} ${this.name.last}",
        email = this.email,
        birthday = this.dob.date,
        age = this.dob.age,
        address = this.location.country,
        phoneNumber = this.phone,
        password = this.login.password,
        img = this.picture.large
    )
}