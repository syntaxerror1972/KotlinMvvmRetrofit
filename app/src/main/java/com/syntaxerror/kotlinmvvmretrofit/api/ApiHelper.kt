package com.syntaxerror.kotlinmvvmretrofit.api

import com.syntaxerror.kotlinmvvmretrofit.api.RetrofitBuilder.apiService

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}