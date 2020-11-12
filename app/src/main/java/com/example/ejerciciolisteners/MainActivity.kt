package com.example.ejerciciolisteners

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botoncambio = findViewById<Button>(R.id.botonprin)
        val editTextnom = findViewById<EditText>(R.id.etnom)


        botoncambio.setBackgroundColor(getColor(R.color.black))

        botoncambio.setOnClickListener {

            if (botoncambio.text == "Comenzar") {
                botoncambio.text = "Finalizar"
                editTextnom.visibility = View.VISIBLE

            } else {
                botoncambio.text = "Comenzar"
                editTextnom.visibility = View.INVISIBLE
                batjoker(editTextnom, botoncambio)
            }
        }

        editTextnom.setOnClickListener {
            editTextnom.setText("")
            editTextnom.setOnFocusChangeListener { v, hasFocus ->
                if (editTextnom.isFocused)
                    editTextnom.setText("")
                else {
                    editTextnom.setText("Introduzca un nombre")
                }
            }
        }
    }

    fun batjoker(editTextnom: EditText, botoncambio: Button) {
        val imagenbatman = findViewById<ImageView>(R.id.batman)
        val jokercambio = findViewById<LinearLayout>(R.id.todo)
        if (editTextnom.text.toString().equals("wayne")) {
            imagenbatman.setImageResource(R.drawable.batman)
            imagenbatman.visibility = View.VISIBLE
        } else if (editTextnom.text.toString().equals("joker")) {
            jokercambio.setBackgroundColor(getColor(R.color.purpura))
            botoncambio.setBackgroundColor(getColor(R.color.verde_oscuro))
        }
    }


}



