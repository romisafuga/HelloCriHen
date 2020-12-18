package com.example.hellocrihen

class Guitarra {
    var color:String=""
    constructor(color:String){
        this.color = color
    }
    fun afinar(){
        println("HIJO : AFINAR guitarra es $color")
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
        println("HIJO : AFINAR guitarra es $color")
    }
    override fun tocar(){
        println("HIJO : TOCANDO nombre $nombre marca $marca")
    }
}

open class Guitarra3 :InstrumentoMusical2{
    var color:String=""
    constructor(color:String,
                nombre:String,
                tipoInstrumento:String):super(nombre,tipoInstrumento){
        this.color = color
    }
    fun afinar(){
        println("HIJO : AFINAR guitarra es $color")
    }
    override fun tocar(){
        println("HIJO : TOCANDO nombre $nombre marca $marca")
    }

    override fun tipoSonido() {
        println("Not yet implemented")
    }
}