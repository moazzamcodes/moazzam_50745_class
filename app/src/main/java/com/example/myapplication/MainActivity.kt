package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

btnCalculate.setOnClickListener {

    val intent = Intent(this, active::class.java)




    if (!edtWeight.text.toString().equals("") && !edtHeightFt.text.toString().equals("") && !edtHeightIn.text.toString().equals("")){

        val weight = (edtWeight.text.toString()).toDouble()
        val HeightIn = (edtHeightIn.text.toString()).toDouble()
        val HeightFt = (edtHeightFt.text.toString()).toDouble()

        val total_inches = HeightFt*12 + HeightIn
        val cm = total_inches * 2.54
        val meter = cm /100
        val bmi_calc = weight/(meter*meter)



        if (bmi_calc > 25){
          //  Toast.makeText(this, "You are Over Weight", Toast.LENGTH_SHORT).show()


            txtMsg.text ="You are Over Weight"

            intent.putExtra("Msg", txtMsg.text)

        }else if (bmi_calc<18){
            //Toast.makeText(this, "You are under Weight", Toast.LENGTH_SHORT).show()

            txtMsg.text="You are under Weight"

            intent.putExtra("Msg", txtMsg.text)


        }
        else{
            //Toast.makeText(this, "You are Healthy", Toast.LENGTH_SHORT).show()
            txtMsg.text="You are Healthy"

            intent.putExtra("Msg", txtMsg.text)

        }




        txtResult.text= "Your BMI is : "+bmi_calc
        intent.putExtra("Ress", txtResult.text)

    }else{
        Toast.makeText(this, "Please Fill all the fields", Toast.LENGTH_SHORT).show()
    }

    startActivity(intent)

    }

}


    }
