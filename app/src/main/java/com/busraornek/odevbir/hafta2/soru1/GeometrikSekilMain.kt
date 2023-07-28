package com.busraornek.odevbir.hafta2.soru1

import com.busraornek.odevbir.hafta2.soru1.Daire
import com.busraornek.odevbir.hafta2.soru1.Dikdortgen

fun main(){

    val dikdortgen = Dikdortgen(5.0, 3.0)
    dikdortgen.cevre()
    dikdortgen.alan()

    val dikdortgen1 = Dikdortgen(4.3, 3.5)
    dikdortgen1.cevre()
    dikdortgen1.alan()

    val daire = Daire(5.2)

    daire.cevre()
    daire.alan()

    val daire1 = Daire(1.0)

    daire1.cevre()
    daire1.alan()
}