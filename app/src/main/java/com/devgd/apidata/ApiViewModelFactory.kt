package com.devgd.apidata

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ApiViewModelFactory(val application:Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ApiViewModel::class.java)) {
            return ApiViewModel(ApiRepo(application)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}