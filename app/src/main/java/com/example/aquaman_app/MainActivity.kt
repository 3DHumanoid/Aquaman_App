package com.example.aquaman_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aquaman_app.settings.BLEActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settingsBtnPress = findViewById<Button>(R.id.settings_btn)

        settingsBtnPress.setOnClickListener {
            val intent = Intent(this, BLEActivity::class.java)
            startActivity(intent)
        }
    }
}