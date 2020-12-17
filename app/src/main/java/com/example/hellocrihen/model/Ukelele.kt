package com.example.hellocrihen.model

import com.example.hellocrihen.Guitarra2

class Ukelele:Guitarra2("","","") {
    var tipo:String =""
    fun cambiaCuerda(){
        println("NIETO: se estan cambiando las cuerdas del $nombre")
    }
}

class Ukelele2:Guitarra2{
    var tipo:String=""

    constructor(tipo:String,
                color:String,
                nombre:String,
                tipoInstrumento:String)
               :super(color,nombre,tipoInstrumento){
        this.tipo=tipo
     }

    fun cambiaCuerda(){
        println("NIETO: se estan cambiando las cuerdas del $nombre")
    }

    override fun tocar(){
        println("NIETO: Estoy tocando una guitarra de nombre $nombre\n y de marca $marca")
        println("NIETO: tocar con los dedos")
    }
}