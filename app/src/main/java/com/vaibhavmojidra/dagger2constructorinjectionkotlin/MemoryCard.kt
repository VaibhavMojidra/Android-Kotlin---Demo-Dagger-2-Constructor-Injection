package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log
import javax.inject.Inject

class MemoryCard @Inject constructor(){
    init {
        Log.i("MyInfo","Memory Card Constructed")
    }

    fun getSpaceAvailability(){
        Log.i("MyInfo","Memory space is available")
    }
}
