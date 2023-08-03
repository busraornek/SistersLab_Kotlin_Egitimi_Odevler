package com.busraornek.odevbir.hafta3.soru5

fun main(){
    val t1 = Thread1()
    t1.start()
    val t2 = Thread2()
    t2.start()

    for(i in 1..45){
        println("Main Thread: $i")
        Thread.sleep(6000)
    }
}