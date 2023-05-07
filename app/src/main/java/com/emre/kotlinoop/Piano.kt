package com.emre.kotlinoop

class Piano :HouseDecor, Instrument { // kalıtımı "interface" sayfalarından aldığımız için birden fazla kalıtım alabiliriz

    var brand : String? = null
    var digital : Boolean? = null
    override var roomName: String
        get() = "Kitchen" // Değer verme
        set(value) {}
}