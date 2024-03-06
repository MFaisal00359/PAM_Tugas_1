package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val name = intent.getStringExtra("NAME")
        val gender = intent.getStringExtra("GENDER")
        val prodi = intent.getStringExtra("PRODI")

        textViewName.text = "Nama: $name"
        textViewGender.text = "Jenis Kelamin: $gender"
        textViewProdi.text = "Jurusan: $prodi"
    }
}
