package ir.omidrezabagherian.login

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var buttonEnter: Button
    lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.inputUsername)
        password = findViewById(R.id.inputPassword)
        buttonEnter = findViewById(R.id.buttonEnter)
        textViewResult = findViewById(R.id.textViewResult)

        buttonEnter.setOnClickListener { login() }

    }

    fun login() {
        val user = username.text.toString()
        val pass = password.text.toString()
        if (user == "Omidreza" && pass == "123456") {
            textViewResult.visibility = View.VISIBLE
            textViewResult.text = "$user, welcome to panel"
        } else {
            textViewResult.visibility = View.INVISIBLE
        }
    }
}