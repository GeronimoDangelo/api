package com.study.interview1.data.remote.response

data class ResultDto(
    val cell: String,
    val dobDto: DobDto,
    val email: String,
    val gender: String,
    val idDto: IdDto,
    val locationDto: LocationDto,
    val loginDto: LoginDto,
    val nameDto: NameDto,
    val nat: String,
    val phone: String,
    val pictureDto: PictureDto,
    val registered: RegisteredDto
)