package com.syntaxerror.kotlinmvvmretrofit.data.repository

import com.syntaxerror.kotlinmvvmretrofit.api.ApiHelper

class UserRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}
