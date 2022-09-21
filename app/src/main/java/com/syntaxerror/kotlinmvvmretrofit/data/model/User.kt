package com.syntaxerror.kotlinmvvmretrofit.data.model

import com.google.gson.annotations.SerializedName
import java.net.IDN

data class User(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name:String = "",
    @SerializedName("email")
    val email:String = "",
    @SerializedName("avatar")
    val avatar:String = ""
)
