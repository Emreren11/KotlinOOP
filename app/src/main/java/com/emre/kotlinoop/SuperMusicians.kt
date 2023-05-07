package com.emre.kotlinoop

class SuperMusicians(name: String, instrument: String, age: Int) : Musicians(name, instrument, age) {
    // Musicians sınıfından kalıtım alabilmek için o sınıfta olan constructor'ın aynısını işlememiz gerekir. Çünkü o sınıfın özelliklerini kullanmaya çalışyoruz


    fun sing() {
        println("nothing else matters")
    }

}