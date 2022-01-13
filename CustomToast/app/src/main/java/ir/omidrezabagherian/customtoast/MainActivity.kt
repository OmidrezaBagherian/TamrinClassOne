package ir.omidrezabagherian.customtoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val layout = layoutInflater.inflate(R.layout.toast_custom, linearLayout, false)
        val buttonToast = findViewById<Button>(R.id.buttonToast)

        buttonToast.setOnClickListener {
            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_LONG
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            toast.view = layout
            toast.show()
        }

    }
}