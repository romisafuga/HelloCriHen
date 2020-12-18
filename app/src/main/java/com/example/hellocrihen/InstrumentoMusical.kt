package com.example.hellocrihen

open class InstrumentoMusical(nombre:String, tipoInstrumento:String) {
    var nombre: String=nombre
    var marca: String="POR DEFECTO"
    var tipoInstrumento: String=tipoInstrumento

    open fun tocar(){
        println("PADRE: TOCANDO tipo $tipoInstrumento nombre $nombre marca $marca")
    }

    fun limpiar(){
        println("PADRE: LIMPIANDO el instrumento de nombre $nombre")
    }
}

/*
una clase abstracta puede tener funciones fijas y funciones
abstractas, las funciones abstractas solo se pone el nombre
de la funcion es responsabilidad de los hijos determinar que
se hace en cada funcion, solo en el primer hijo concreto de lo
contrario si el hijo es abstracto hasta que el nieto sea concreto
 */
abstract class InstrumentoMusical2(nombre:String, tipoInstrumento:String) {
    var nombre: String=nombre
    var marca: String="POR DEFECTO"
    var tipoInstrumento: String=tipoInstrumento

    open fun tocar(){
        println("PADRE: TOCANDO tipo $tipoInstrumento nombre $nombre marca $marca")
    }

    fun limpiar(){
        println("PADRE: LIMPIANDO el instrumento de nombre $nombre")
    }

    abstract fun tipoSonido()
}