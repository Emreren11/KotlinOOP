package com.emre.kotlinoop

open class Musicians(name: String, instrument: String, age: Int) { // Primary Constructor

    //open -> diğer class'lardan kalıtım alınması için konur

    //encapsulation

    var name: String? = name
        get
        private set
    private var instrument: String? = instrument

    var age: Int? = age
        private set
        get

}