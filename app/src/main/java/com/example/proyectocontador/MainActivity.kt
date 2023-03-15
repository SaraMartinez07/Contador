package com.example.proyectocontador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var inicia = 0
    private var aumenta = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lblnumero = findViewById<TextView>(R.id.txtnumero)
        val buttonAumenta = findViewById<Button>(R.id.botonAumenta)
        val buttonReset = findViewById<Button>(R.id.botonReversa)

        buttonAumenta.setOnClickListener{
            if (aumenta){
                inicia++

                if (inicia>=10){
                    aumenta = false
                }

            }else{
                inicia--

                if (inicia<=0){
                    aumenta=true
                }
            }
            lblnumero.text=inicia.toString()

        }
        buttonReset.setOnClickListener{
            inicia = 0
            aumenta = true

            lblnumero.text = inicia.toString()
        }

    }
}