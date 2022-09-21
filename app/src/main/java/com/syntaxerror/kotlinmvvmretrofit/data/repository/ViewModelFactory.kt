package com.syntaxerror.kotlinmvvmretrofit.data.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.syntaxerror.kotlinmvvmretrofit.api.ApiHelper
import com.syntaxerror.kotlinmvvmretrofit.viewmodel.UserViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            return UserViewModel(UserRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}