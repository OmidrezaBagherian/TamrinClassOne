package ir.omidrezabagherian.diseapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imageViewDise:ImageView
    lateinit var buttonDiseNumber:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewDise = findViewById(R.id.imageViewDise)
        buttonDiseNumber = findViewById(R.id.buttonDiseNumber)

        buttonDiseNumber.setOnClickListener { diseNumber() }

    }

    fun diseNumber(){
        var diseNumber = Random.nextInt(6) + 1

        when (diseNumber) {
            1 -> imageViewDise.setImageResource(R.drawable.dice_1)
            2 -> imageViewDise.setImageResource(R.drawable.dice_2)
            3 -> imageViewDise.setImageResource(R.drawable.dice_3)
            4 -> imageViewDise.setImageResource(R.drawable.dice_4)
            5 -> imageViewDise.setImageResource(R.drawable.dice_5)
            6 -> imageViewDise.setImageResource(R.drawable.dice_6)
        }
    }
}