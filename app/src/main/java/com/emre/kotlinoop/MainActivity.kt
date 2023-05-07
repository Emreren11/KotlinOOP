package com.emre.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor

        val myUser = User("Emre", 24)
        println(myUser.age)
        println(myUser.name)
        println(myUser.information())


        //encapsulation -> kapsülleme

        var emre = Musicians("Emre", "Guitar", 24)
        //emre.age = 20 -> private olduğu için değişemez
        println(emre.age)
        println(emre.name)


        //inheritance -> kalıtım alma

        var eren = SuperMusicians("Eren", "Drums", 50)
        println(eren.name)
        println(eren.age)
        eren.sing()


        //polymorphsim

        //static polymorphsim -> aynı sınıfta aynı fonksiyon ismini kullanma

        var math = Math()
        println(math.sum())
        println(math.sum(3, 4))

        //dynamic polymorphsim -> farklı sınıfta aynı fonksiyon ismini kullanma

        val animal = Animal()
        animal.sing()

        val  barley = Dog()
        barley.sing()
        barley.test()


        // abstract & interface -> soyut sınıf oluşturma (soyut sınıf -> obje oluşturulamaz, kalıtım yapılır)
        //var myPeople = People() -> abstarct olduğu için tanımlama yapılamaz
        // Interface olan sayfalar sınıflar içerisinde birden fazla kalıtım verebilir
        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

    }
}