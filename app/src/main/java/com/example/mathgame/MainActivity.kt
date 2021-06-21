package com.example.mathgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {
    var number1 = 0
    var number2 = 0
    var amal = 0
    var javob = 0

    var userAnswer = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        random()
        btn_1.setOnClickListener {

            userAnswer = edit_1.text.toString().toDouble().toInt()
            if (userAnswer == javob) {
                Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show()
            } else {

                Toast.makeText(this, "UnCorrect ", Toast.LENGTH_LONG).show()

                
            }
            random()

        }

    }

    fun random() {

        number1 = Random().nextInt(20)
        number2 = Random().nextInt(20)
         javob = Random().nextInt(20 )
        amal = Random().nextInt(5)

        ekrangaChiqar()
    }

    fun ekrangaChiqar() {
        when (amal) {

            0 -> {
                javob = number2 + number1
                txt_1.text = "$number2 + $number1 = "
            }
            1 -> {
                javob = number2 - number1
                txt_1.text = "$number2 - $number1 = "

            }
            2 -> {
                javob = number2 * number1
                txt_1.text = "$number2 * $number1 = "
            }

            3 -> {
                try {
                    javob = number2 / number1
                    txt_1.text = "$number2 / $number1 = "
                } catch (e: Exception) {
                    random()

                }
            }

        }

    }


}