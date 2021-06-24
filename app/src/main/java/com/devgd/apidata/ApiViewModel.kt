package com.devgd.apidata


import androidx.lifecycle.LiveData

import androidx.lifecycle.ViewModel


class ApiViewModel(val repo:ApiRepo) : ViewModel() {

    fun getData(): LiveData<List<ApiModelClass>> {
        return repo.getData()
    }

}