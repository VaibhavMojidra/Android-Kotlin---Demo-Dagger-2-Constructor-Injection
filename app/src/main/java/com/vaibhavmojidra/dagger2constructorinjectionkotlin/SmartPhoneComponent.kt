package com.vaibhavmojidra.dagger2constructorinjectionkotlin

import com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin.SmartPhone
import dagger.Component

@Component
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}