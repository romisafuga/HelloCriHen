package com.example.hellocrihen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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

        with (miObjetoPersona){
            nombre = "Samuel"
            documento ="pasaporte"
            edad = 15
            telefono ="44-3433-3435"
            caminar()
            imprimirDatos()
        }
    }
}

