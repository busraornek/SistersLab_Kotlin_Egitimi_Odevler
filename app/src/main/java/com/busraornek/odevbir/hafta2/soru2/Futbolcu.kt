package com.busraornek.odevbir.hafta2.soru2

class Futbolcu(ad:String , yas:Int, takimi:String): Oyuncu(ad,yas,takimi) {

    fun golAt(){
        println("$ad gol attı.")
    }

    override fun oyna() {
        println("$ad futbol oynuyor.")
    }
}