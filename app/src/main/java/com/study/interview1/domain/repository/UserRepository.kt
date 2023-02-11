package com.study.interview1.domain.repository

import com.study.interview1.domain.model.User
import com.study.interview1.domain.util.Resource

interface UserRepository {

    suspend fun fetchUser(): Resource<User>

}