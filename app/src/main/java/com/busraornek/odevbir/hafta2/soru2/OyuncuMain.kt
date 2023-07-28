package com.busraornek.odevbir.hafta2.soru2

import com.busraornek.odevbir.hafta2.soru2.Basketbolcu
import com.busraornek.odevbir.hafta2.soru2.Futbolcu

fun main(){

    val futbolcu = Futbolcu("Mehmet", 28, "Galatasaray")
    futbolcu.oyna()
    futbolcu.golAt()

    val futbolcu1 = Futbolcu("Mustafa", 23, "Beşiktaş")
    futbolcu1.oyna()
    futbolcu1.golAt()

    val basketbolcu = Basketbolcu("Ayşe", 21, "Fenerbahçe")
    basketbolcu.oyna()
    basketbolcu.basketAt()

    val basketbolcu1 = Basketbolcu("Cenk", 27, "Anadolu Efes")
    basketbolcu1.oyna()
    basketbolcu1.basketAt()
}