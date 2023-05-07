package com.emre.kotlinoop

class Dog : Animal() {

    fun test() { // super -> kalıtım alınan sınıfa referans verir
        super.sing() // super ile sing çağırıldığı için kalıtım alınan sayfadaki sing i çağırır
    }

    override fun sing() { // kalıtım aldığımız sınıfta aynı isimde olduğu için override (üzerine yazma) ediyoruz

        println("dog class")
    }
}