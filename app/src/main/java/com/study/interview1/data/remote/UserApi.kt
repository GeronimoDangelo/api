package com.study.interview1.data.remote

import com.study.interview1.data.remote.response.ResponseDto
import retrofit2.http.GET

interface UserApi {

    @GET("/api/")
    suspend fun fetchUser(): ResponseDto

}