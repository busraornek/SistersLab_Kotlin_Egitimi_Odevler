package com.busraornek.odevbir.hafta2.soru2

open class Oyuncu(val ad: String, val yas:Int , val tekimi:String) {

    open fun oyna(){
        println("$ad oynuyor.")
    }
}