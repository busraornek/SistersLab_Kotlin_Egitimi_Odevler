package com.busraornek.odevbir.hafta2.soru3

fun main(){


    val personel = Personel("Büşra", "Örnek", "Mühendis", 12000.0)

    println("Personel adı: ${personel.ad}")
    println("Personel soyadı: ${personel.soyad}")
    println("Personel pozisyonu: ${personel.pozisyon}")
    println("Personel maaşı: ${personel.maas}")

// %20 zam yapılıyor.
    personel.maasArttir(0.20)

    println("Zamlı maaşı: ${personel.maas}")

}