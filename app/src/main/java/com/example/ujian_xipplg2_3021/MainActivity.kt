package com.example.ujian_xipplg2_3021


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val biodataActivity = findViewById<Button>(R.id.buttonbiodata)
        biodataActivity.setOnClickListener {
            val intent = Intent(this,biodataActivity::class.java)
            startActivity(intent)
        }
        val pendidikanActivity= findViewById<Button>(R.id.buttonpendidikan)
        pendidikanActivity.setOnClickListener {
            val intent = Intent(this, pendidikanActivity::class.java)
            startActivity(intent)
        }
        val portofolioActivity= findViewById<Button>(R.id.buttonportofolio)
        portofolioActivity.setOnClickListener {
            val intent = Intent(this, portofolioActivity::class.java)
            startActivity(intent)

        }
    }

}