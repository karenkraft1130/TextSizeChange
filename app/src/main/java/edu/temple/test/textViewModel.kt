package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//commit

class textViewModel : ViewModel() {

    private val textSize : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun getColor () : LiveData<Int> {
        return textSize
    }

    fun setColor (text: Int) {
        textSize.value = text
    }
}