package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(val battery:Battery,val simCard:SimCard,val memoryCard:MemoryCard) {
    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i("MyInfo","SmartPhone Constructed")
    }

    fun makeCallRecording(){
        Log.i("MyInfo","Calling...")
    }
}