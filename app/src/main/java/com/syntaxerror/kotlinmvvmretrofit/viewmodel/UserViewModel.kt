package com.syntaxerror.kotlinmvvmretrofit.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.syntaxerror.kotlinmvvmretrofit.data.repository.UserRepository
import com.syntaxerror.kotlinmvvmretrofit.utils.Resource
import kotlinx.coroutines.Dispatchers

class UserViewModel(private val mainRepository: UserRepository) : ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getUsers()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }
}