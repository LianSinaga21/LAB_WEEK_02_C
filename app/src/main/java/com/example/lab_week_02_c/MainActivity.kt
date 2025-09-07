package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ambil tombol dari layout
        val btnStandard: Button = findViewById(R.id.button_standard)
        val btnSingleTop: Button = findViewById(R.id.button_single_top)

        // Listener bersama
        val buttonClickListener = View.OnClickListener { view ->
            when (view.id) {
                R.id.button_standard -> {
                    startActivity(Intent(this, StandardActivity::class.java))
                }
                R.id.button_single_top -> {
                    startActivity(Intent(this, SingleTopActivity::class.java))
                }
            }
        }

        // Set listener ke tombol
        btnStandard.setOnClickListener(buttonClickListener)
        btnSingleTop.setOnClickListener(buttonClickListener)
    }
}
