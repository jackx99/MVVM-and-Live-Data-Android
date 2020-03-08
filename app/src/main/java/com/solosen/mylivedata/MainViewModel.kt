package com.solosen.mylivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var data = MutableLiveData<String>()

    fun send() {
        data.value = "Sample Data"
    }

    fun receive() = data as LiveData<String>
}