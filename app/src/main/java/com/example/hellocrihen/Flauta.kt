package com.example.hellocrihen

class Flauta(tam:String) : InstrumentoMusical(nombre = "",tipoInstrumento = "") {
    var tam:String=tam
    fun brillar(){
        println("Estas brillando la flauta $tam")
    }
}

// crear una clase hijo del padre InstrumentoMusical pero agregandole
// directamente 2 parametros necesarios para la clase padre arriba
// esta pasandole por default "" a los 2 parametros
class Flauta2(tam:String,nombre:String,tipoInstrumento:String)
               :InstrumentoMusical(nombre,tipoInstrumento){
    var tam:String=tam
    fun brillar(){
        println("HIJO: Estas brillando la flauta $tam")
    }
    override fun tocar(){
        // manda llamar primero a la funcion del padre y luego continua
        super.tocar()
        println("HIJO: Estoy soplando una flauta de tipo $tipoInstrumento" +
                " de nombre $nombre\n y de marca $marca")
        println("HIJO: ver partitura")
    }
}