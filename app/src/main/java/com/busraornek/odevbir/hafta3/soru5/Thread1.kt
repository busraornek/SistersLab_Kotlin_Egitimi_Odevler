package com.busraornek.odevbir.hafta3.soru5

class Thread1:Thread() {
    override fun run() {
        for (i in 1..50){
            println("Birinci Thread $i")
            Thread.sleep(5000)
        }
    }
}