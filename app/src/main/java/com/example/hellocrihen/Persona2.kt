package com.example.hellocrihen

class Persona2 (documento:String,nombre:String,edad:Int,telefono:String){
    var documento: String = documento
    var nombre: String = nombre
    var edad: Int = edad
    var telefono: String = telefono

    // este constructor es opcional si no se escribe el default es nulo
    constructor():this("nada","NADA",0,"99-9999"){
        println("estoy en constructor")
    }

    // para hacer procesos de validacion al recibir parametros inmediatamente despues
    // del constructor poner el init aqui vamos a validar edad no negativa

    init{
        println("la edad recibida es $edad")
        if (edad<0)
            this.edad = 0
    }
    fun caminar() {
        println("la persona $nombre esta caminando")
    }

    fun imprimirDatos() {
        var docto = "Persona: $nombre\nDocumento: " +
                "$documento\nEdad: $edad\nTel.: $telefono"
        println(docto)
    }
}