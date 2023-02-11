package com.study.interview1.data.remote.response

data class InfoDto(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)