package com.amanguru.mathoprations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.amanguru.airthmatic.Basic

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c=Basic()
        Toast.makeText(applicationContext,c.oprations(2,3,3).toString(),Toast.LENGTH_LONG).show()
    }
}
