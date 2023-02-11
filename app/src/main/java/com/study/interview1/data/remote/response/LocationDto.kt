package com.study.interview1.data.remote.response

data class LocationDto(
    val city: String,
    val coordinatesDto: CoordinatesDto,
    val country: String,
    val postcode: Int,
    val state: String,
    val streetDto: StreetDto,
    val timezoneDto: TimezoneDto
)