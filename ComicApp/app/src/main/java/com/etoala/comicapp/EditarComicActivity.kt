package com.etoala.comicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView

class EditarComicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_comic)

        initEvents()
    }

    fun initEvents(){
        val actualizarButton: Button =findViewById<Button>(R.id.actualizarBtn)
        actualizarButton.setOnClickListener{
            finish()
        }
        val atrasimageView: ImageView =findViewById<ImageView>(R.id.btn_back)
        atrasimageView.setOnClickListener{
            finish()
        }
    }
}