package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StandardActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)

        // Debug log
        Log.d(DEBUG, "onCreate StandardActivity")

        // Cari button (gunakan safe call biar tidak crash kalau tidak ketemu)
        val btnStandard = findViewById<Button>(R.id.button_standard)

        if (btnStandard != null) {
            btnStandard.setOnClickListener {
                startActivity(Intent(this, StandardActivity::class.java))
            }
        } else {
            Log.e(DEBUG, "Button dengan id 'button_standard' tidak ditemukan di layout!")
        }
    }
}
