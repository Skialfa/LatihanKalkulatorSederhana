package com.mobiledimas.kalkulatorsederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var angka1 : EditText
    private lateinit var angka2 : EditText
    private lateinit var tambah : Button
    private lateinit var kurang : Button
    private lateinit var kali : Button
    private lateinit var txthasil : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        angka1 = findViewById(R.id.angka1_input)
        angka2 = findViewById(R.id.angka2_input)
        tambah = findViewById(R.id.tambah)
        kurang = findViewById(R.id.kurang)
        kali   = findViewById(R.id.kali)
        txthasil  = findViewById(R.id.hasil)

        tambah.setOnClickListener(){
            val angka1 = angka1.text.toString().toInt()
            val angka2 = angka2.text.toString().toInt()
            val hasil = angka1 + angka2

            txthasil.setText("Hasil Tambah : " + hasil)
        }
        kali.setOnClickListener(){
            val angka1 = angka1.text.toString().toInt()
            val angka2 = angka2.text.toString().toInt()
            val hasil = angka1 * angka2

            txthasil.setText("Hasil kali : " + hasil)
        }
        kurang.setOnClickListener() {
            val angka1 = angka1.text.toString().toInt()
            val angka2 = angka2.text.toString().toInt()
            val hasil = angka1 - angka2

            txthasil.setText("Hasil Kurang : " + hasil)
        }
    }
}