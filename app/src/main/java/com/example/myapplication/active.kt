package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_active.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.txtMsg
import kotlinx.android.synthetic.main.activity_main.txtResult

class active : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_active)

       // val data = intent.getStringExtra("key")

        val res = intent.extras?.getString("Ress").toString()
       val msg=  intent.extras?.getString("Msg")
txtMsg.text = "${res}\n${msg}"



        //txtResult.text = intent.extras?.getString("Result")

       // btnCalculate.text = "${txtMsg.text}\n${txtResult.text}"
    }
}