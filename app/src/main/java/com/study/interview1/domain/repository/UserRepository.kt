package com.study.interview1.domain.repository

import com.study.interview1.domain.model.User

interface UserRepository {

    suspend fun fetchUser(): User

}