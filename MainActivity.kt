package com.example.assingment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..38 -> "Leopold Takawira"
                    in 38..41 -> "Josiah Tongogara"
                    in 41..55 -> "Lookout Masuku"
                    in 55..56 -> "Josiah Chinamano"
                    in 56..57 -> "Maurice Nyagumbo"
                    in 57..60 -> "Eddison Zvobgo"
                    in 60..61 -> "Edson Sithole"
                    in 61..62 -> "Solomon Mujuru"
                    in 62..74 -> "George Nyandoro"
                    in 74..82 -> "Joshua Nkomo"
                    else -> "Senior"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "Leopold Takawira" -> "Leopold Takawira died at the age of 38."
                        "Josiah Tongogara" -> "Josiah Tongogara died at the age of 41."
                        "Lookout Masuku" -> "Lookout Masuku died at the age of 55."
                        "Josiah Chinamano" -> "Josiah Chinamano died at the age of 56."
                        "Maurice Nyagumbo" -> "Maurice Nyagumbo died at the age of 57."
                        "Eddison Zvobgo" -> "Ëddison Zvobgo died at the age of 60."
                        "Edson Sithole" -> "Edson Sithole died at the age of 61."
                        "Solomon Mujuru" -> "Solomon Mujuru died at the age of 62."
                        "George Nyandoro" -> "George Nyandoro died at the age of 74."
                        "Joshua Nkomo" -> "Joshua Nkomo died at the age of 82."
                        else -> "You are a Senior."
                    }

                }else {"
                txtResult.text = "Please enter a valid age."
            }

        }
        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }
}















