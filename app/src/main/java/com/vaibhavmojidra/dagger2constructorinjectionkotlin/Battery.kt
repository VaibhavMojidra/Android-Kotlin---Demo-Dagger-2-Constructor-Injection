package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.i("MyInfo","Battery Constructed")
    }

    fun getPower(){
        Log.i("MyInfo","Battery Power is available")
    }
}
