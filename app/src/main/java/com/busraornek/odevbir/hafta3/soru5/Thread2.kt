package com.busraornek.odevbir.hafta3.soru5

class Thread2:Thread() {
    override fun run() {
        for (i in 51..100){
            println("İkinci Thread $i")
            Thread.sleep(3000)
        }
    }
}