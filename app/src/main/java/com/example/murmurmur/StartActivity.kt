package com.example.murmurmur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        GlobalScope.launch {
            Thread.sleep(5000)
            startActivity(Intent(this@StartActivity, MainActivity::class.java))
            finish()
        }

    }

}