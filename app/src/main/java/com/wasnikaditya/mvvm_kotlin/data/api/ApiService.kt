package com.wasnikaditya.mvvm_kotlin.data.api

import com.wasnikaditya.mvvm_kotlin.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}