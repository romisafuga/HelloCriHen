package com.example.hellocrihen

class Persona {
    var  documento: String = ""
    var nombre: String = ""
    var edad: Int = 0
        get() = field
        set(value) {
            if(value >0)
               field = value
            else
                field=0
        }
    var telefono: String = ""

    fun caminar() {
        println("la persona $nombre esta caminando")
    }

    fun imprimirDatos() {
        var docto = "Persona: $nombre\nDocumento: " +
                "$documento\nEdad: $edad\nTel.: $telefono"
        println(docto)
    }
}