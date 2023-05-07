package com.emre.kotlinoop

class User : People{
    var name : String? = null
    var age : Int? = null

    //Secondary Constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    init { // constructor ile aynı işlevi görür. Sınıf çağırıldığında bu kod bloğu da çalışır

    }
}