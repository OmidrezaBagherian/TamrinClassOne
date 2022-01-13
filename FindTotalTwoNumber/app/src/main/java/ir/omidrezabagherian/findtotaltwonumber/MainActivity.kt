package ir.omidrezabagherian.findtotaltwonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var numbers: EditText
    lateinit var number: EditText
    lateinit var buttonCalc: Button
    lateinit var findTotal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numbers = findViewById(R.id.inputNumbers)
        number = findViewById(R.id.inputNumber)
        buttonCalc = findViewById(R.id.buttonCalcNumber)
        findTotal = findViewById(R.id.findTotal)

        buttonCalc.setOnClickListener { findNumbers() }

    }

    fun findNumbers() {
        var find = false
        val numbersTemp = numbers.text.toString().split(",")
        val numberTemp = number.text.toString().toInt()
        for (i in numbersTemp) {
            for (j in numbersTemp) {
                if (numberTemp == i.toInt() + j.toInt()) {
                    find = true
                    break
                }
            }
        }
        findTotal.text = find.toString()
    }
}