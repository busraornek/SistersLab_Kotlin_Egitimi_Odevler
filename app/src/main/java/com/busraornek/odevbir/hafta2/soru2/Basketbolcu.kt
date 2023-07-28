package com.busraornek.odevbir.hafta2.soru2

class Basketbolcu(ad:String , yas:Int, takimi:String): Oyuncu(ad,yas,takimi) {

    fun basketAt(){
        println("$ad basket attı.")
    }

    override fun oyna() {
        println("$ad basketbol oynuyor.")
    }
}