package com.busraornek.odevbir.hafta2.soru5

class Kullanici(val ad:String? , val soyad:String?) {

    fun bilgiAl(){
        if(ad != null && soyad != null) {
            println("Kullanıcının adı soyadı : $ad $soyad")

        }else if(ad == null){
            println("Kullanıcının adı null.")
        }else{
            println("Kullanıcının soyadı null.")
        }

    }
}