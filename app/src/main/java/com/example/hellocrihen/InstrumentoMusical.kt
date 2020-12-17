package com.example.hellocrihen

open class InstrumentoMusical(nombre:String, tipoInstrumento:String) {
    var nombre: String=nombre
    var marca: String="POR DEFECTO"
    var tipoInstrumento: String=tipoInstrumento

    open fun tocar(){
        println("PADRE : Estoy tocando el instrumento de tipo $tipoInstrumento" +
                " de nombre $nombre\n y de marca $marca")
    }

    fun limpiar(){
        println("PADRE: Estoy limpiando el instrumento de nombre $nombre")
    }
}