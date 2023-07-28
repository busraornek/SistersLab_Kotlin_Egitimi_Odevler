package com.busraornek.odevbir.hafta2.soru1

import kotlin.math.PI

class Daire(val yariCap:Double) : GeometrikSekil() {
    override fun cevre(): Double {
        val daireCevre = 2 * PI * yariCap
        println("Dairenin çevresi: $daireCevre")
        return daireCevre
    }

    override fun alan(): Double {
        val daireAlan = PI * yariCap * yariCap
        println("Dairenin alanı : $daireAlan")
        return daireAlan
    }
}