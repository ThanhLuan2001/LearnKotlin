package com.example.kotlinbasic.Part_4

fun main(){
    var lamp1 = Lamp()
    lamp1.turnOn()
    lamp1.statusLamp("Bóng đèn 1")

    var lamp2 = Lamp()
    lamp2.turnOff()
    lamp2.statusLamp("Bóng đèn 2")
}


internal class Lamp{

    private var isOn = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun statusLamp(lamp : String){
        if (isOn){
            println("$lamp đang bật")
        }else{
            println("$lamp đang tắt")
        }
    }

}