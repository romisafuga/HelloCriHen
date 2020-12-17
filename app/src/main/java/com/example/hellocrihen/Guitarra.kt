package com.example.hellocrihen

class Guitarra {
    var color:String=""
    constructor(color:String){
        this.color = color
    }
    fun afinar(){
        println("HIJO: El color de la guitarra es $color")
    }
}

// crear una clase hijo del padre InstrumentoMusical
//  2 parametros necesarios para la clase padre arriba
open class Guitarra2 :InstrumentoMusical{
    var color:String=""
    constructor(color:String,
                nombre:String,
                tipoInstrumento:String):super(nombre,tipoInstrumento){
        this.color = color
    }
    fun afinar(){
        println("HIJO: El color de la guitarra es $color")
    }
    override fun tocar(){
        println("HIJO: Estoy tocando una guitarra de nombre $nombre\n y de marca $marca")
        println("HIJO: tocar con los dedos")
    }
}