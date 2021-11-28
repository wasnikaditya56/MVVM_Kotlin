package com.wasnikaditya.mvvm_kotlin.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.wasnikaditya.mvvm_kotlin.data.repository.MainRepository
import com.wasnikaditya.mvvm_kotlin.ui.main.viewmodel.MainViewModel
import com.wasnikaditya.mvvm_kotlin.data.api.ApiHelper

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}