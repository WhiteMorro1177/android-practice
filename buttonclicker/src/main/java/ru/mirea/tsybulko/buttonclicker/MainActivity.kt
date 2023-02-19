package ru.mirea.tsybulko.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // bind components
        val textView: TextView = findViewById(R.id.tvOut)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val whoAmIButton: Button = findViewById(R.id.btnWhoAmI)

        // create click listener
        whoAmIButton.setOnClickListener {
            textView.text = "My group number: 25"
            if (checkBox.isChecked) {
                checkBox.toggle()
            }
        }
    }

    fun itIsNotMeButtonClickEvent(view: View) {
        val textView: TextView = findViewById(R.id.tvOut)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        textView.text = "I'm not doing this"
        checkBox.toggle()
    }
}