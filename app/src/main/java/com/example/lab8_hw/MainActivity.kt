package com.example.lab8_hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSer : Button = findViewById(R.id.btnSevice)
        btnSer.setOnClickListener {
                val intent =Intent(this,MyService :: class.java)
                startService(intent)
                Toast.makeText(this,"啟動Service",Toast.LENGTH_LONG).show()
                finish()
        }
    }
}
