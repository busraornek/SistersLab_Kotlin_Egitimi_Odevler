package com.busraornek.odevbir.hafta2.soru1

class Dikdortgen(val uzunluk:Double, val genislik:Double): GeometrikSekil(){

    override fun cevre(): Double {
        val diktorgenCevre = 2 * (uzunluk + genislik)
        println("Diktörtgenin çevresi : $diktorgenCevre")
        return diktorgenCevre
    }

    override fun alan(): Double {
        val diktortgenAlan = uzunluk * genislik
        println("Diktörtgenin alanı : $diktortgenAlan")
        return diktortgenAlan
    }
}