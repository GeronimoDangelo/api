package com.study.interview1.data.remote.response

data class Result(
    val cell: String,
    val dob: Dob,
    val email: String,
    val gender: String,
    val idDto: IdDto,
    val location: Location,
    val login: Login,
    val name: Name,
    val nat: String,
    val phone: String,
    val picture: Picture,
    val registered: Registered
)