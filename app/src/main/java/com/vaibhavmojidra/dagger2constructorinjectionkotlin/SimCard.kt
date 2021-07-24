package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(val serviceProvider:ServiceProvider) {
    init {
        Log.i("MyInfo","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
