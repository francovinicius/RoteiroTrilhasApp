package com.simpletask.roteirotrilhas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGerar = findViewById<Button>(R.id.btnEncontrar)

        btnGerar.setOnClickListener {
            val textLocalidade = findViewById<EditText>(R.id.localidade)
            val textLocalidadeValor = textLocalidade.toString()
            val progressBar = findViewById<ProgressBar>(/* id = */ R.id.progressBar)
            val layoutTxtGerado = findViewById<LinearLayout>(R.id.layoutTxtGerado)
            val textLocais = findViewById<TextView>(R.id.textLocais)

            val handler = Handler(Looper.getMainLooper())

            progressBar.isVisible = true

            handler.postDelayed({

                textLocais.text = "teste"


                progressBar.isVisible = false
                layoutTxtGerado.isVisible = true
            }, 3000)

        }


    }
}