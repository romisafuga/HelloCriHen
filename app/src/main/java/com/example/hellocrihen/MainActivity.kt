package com.example.hellocrihen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hellocrihen.model.Estudiante
import com.example.hellocrihen.model.Robot2
import com.example.hellocrihen.model.Ukelele
import com.example.hellocrihen.model.Ukelele2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var miObjetoPersona: Persona=Persona()
        miObjetoPersona.nombre ="Roberto"
        miObjetoPersona.documento ="Acta de Nacimiento"
        miObjetoPersona.edad = 55
        miObjetoPersona.telefono = "9999-999-999"
        miObjetoPersona.caminar()
        miObjetoPersona.imprimirDatos()
        println("==========================")
        with (miObjetoPersona){
            nombre = "Samuel"
            documento ="pasaporte"
            edad = 15
            telefono ="44-3433-3435"
            caminar()
            imprimirDatos()
        }
        println("==========================")
        // con parametros explicitos
        var miObjetoPersona2:Persona2 = Persona2("Passport","Michelle",
            18,"55-34567")
        with(miObjetoPersona2){
            caminar()
            imprimirDatos()
        }
        println("==========================")
        var listaPersonas: MutableList<Persona2> = mutableListOf()
        // dos maneras de agregar a la lista primero como un objeto ya creado
        listaPersonas.add(miObjetoPersona2)
        // como abjetos nuevos
        listaPersonas.add(Persona2("Rob","acta",22,"55-555"))
        listaPersonas.add(Persona2("Mic","pass",18,"55-678"))
        listaPersonas.add(Persona2("Sam","curp",14,"55-901"))
        // le asigna los valores por default del constructor
        listaPersonas.add(Persona2())
        // imprmir la lista completa de un solo golpe
        println(listaPersonas)
        println("==========================")
        // imprimir uno por uno y solo un dato
        for(dato in listaPersonas){
            println("nombre ${dato.nombre}")
        }
        println("==========================")
        // para imprimir todos los datos se usa la funcion de la clase
        for(dato in listaPersonas)
            dato.imprimirDatos()
        println("==========================")
        var persona3:Persona2 = Persona2("xx","mmm",-6,"5454")
        persona3.imprimirDatos()
        datos()
        musica()

    }

    fun datos(){
        var objEstudiante : Estudiante = Estudiante("Pepe",8.5,9.2,7.7)
        println("El estudiante es ${objEstudiante.nombre}\nNota 1: ${objEstudiante.nota1}")
        // los objetos no se instancian se utiliza directo
        Robot.nombre = "Robocop"
        Robot.caminar()
        // los objetos pueden estar en otro archivo tipo Objeto con terminacion .kt
        Robot2.nombre = "Robotina"
        Robot2.caminar()
    }

    object Robot{
        var nombre : String = ""

        fun caminar(){
            println("el robot es $nombre esta caminando ...")
        }

    }

    fun musica(){
        println("OBJETO INSTRUMENTO ========")
        var miInstrumento:InstrumentoMusical
                = InstrumentoMusical("Instrumento","Percusion")
        with(miInstrumento) {
            marca = "XYZ"
            tocar()
            limpiar()
        }
        println("======= OBJETO GUITARRA")
        var miGuitarra:Guitarra= Guitarra("cafe")
        miGuitarra.afinar()
        println("======= OBJETO GUITARRA2")
        var miGuitarra2:
                Guitarra2= Guitarra2("azul","guitarra2","de cuerdas")
        with(miGuitarra2){
            marca="resistol"
            afinar()
            tocar()
            limpiar()
        }
        println("======= OBJETO FLAUTA")
        var miFlauta:Flauta=Flauta("Pequeña")
        with(miFlauta) {
            nombre = "MI FLAUTICA"
            tipoInstrumento = "DE VIENTO"
            brillar()
            tocar()
            limpiar()
        }
        println("======= OBJETO FLAUTA2")
        var miFlauta2:Flauta2= Flauta2("grande","FLAUTON","DE AIRE")
        with(miFlauta2) {
            marca = "OTRA"
            brillar()
            tocar()
            limpiar()
        }
        println("======= OBJETO UKELELE")
        var miUkelele:Ukelele= Ukelele()
        with(miUkelele) {
            marca = "UKELA"
            tocar()
            limpiar()
            cambiaCuerda()
        }
        println("======= OBJETO UKELELE2")
        var miUkelele2: Ukelele2 = Ukelele2("UKELELE","ROJO",
            "UMA","CARO")
        with(miUkelele2) {
            marca = "UKELA2"
            tocar()
            limpiar()
            cambiaCuerda()
        }



    }
}

