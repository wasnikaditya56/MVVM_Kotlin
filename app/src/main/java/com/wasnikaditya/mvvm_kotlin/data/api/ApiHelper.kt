package com.wasnikaditya.mvvm_kotlin.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}