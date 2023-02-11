package com.study.interview1.data.remote

import com.study.interview1.domain.model.User
import com.study.interview1.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {
    override suspend fun fetchUser(): User {
        TODO("Not yet implemented")
    }
}