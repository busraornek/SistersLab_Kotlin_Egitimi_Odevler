package com.busraornek.odevbir.hafta1.odev1


import java.lang.Exception
import java.util.Scanner

fun main(){


    val girdi = Scanner(System.`in`)

    println("Kullanıcı adınızı giriniz:")
    val kullaniciAdi = girdi.next()

    println("Şifrenizi giriniz: ")

    val kullaniciSifre = girdi.next()

    if(kullaniciAdi.equals("Büşra",ignoreCase = true) && kullaniciSifre.equals("Bir", ignoreCase = false) ){
        println("Hoş geldiniz!")
    }else{
        println("Kullanıcı adı veya şifre hatalı. tekrar deneyiniz!")
    }

}