package com.study.interview1.data.remote

import com.study.interview1.data.mappers.toDomain
import com.study.interview1.domain.model.User
import com.study.interview1.domain.repository.UserRepository
import com.study.interview1.domain.util.Resource
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userApi: UserApi,
) : UserRepository {
    override suspend fun fetchUser(): Resource<User> {
        return try {
            Resource.Success(
                data = userApi.fetchUser().resultDtos.first().toDomain()
            )
        } catch (e: Exception) {
            Resource.Error(e.toString())
        }
    }
}