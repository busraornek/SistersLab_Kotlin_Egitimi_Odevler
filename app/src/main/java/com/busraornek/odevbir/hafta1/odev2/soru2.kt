package com.busraornek.odevbir.hafta1.odev2

import java.lang.Exception
import java.util.Scanner

fun main() {

     println("Yaşınızı giriniz: ")
     val girdi = Scanner(System.`in`)

     try {
         val yas = girdi.nextInt()

         if(yas > 0) {
             if (yas >= 18) {
                 println("Oy kullanabilirsiniz.")
             } else {
                 println("Oy kullanamazsınız. ")
             }
         }else{
             println("Gerçerli bir yaş girmediniz.")
         }
     }catch (e: Exception){
         println("Gerçerli bir yaş girmediniz.")
     }
}