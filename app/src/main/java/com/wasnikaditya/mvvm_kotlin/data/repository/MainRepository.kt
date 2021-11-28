package com.wasnikaditya.mvvm_kotlin.data.repository

import com.wasnikaditya.mvvm_kotlin.data.api.ApiHelper
import com.wasnikaditya.mvvm_kotlin.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}