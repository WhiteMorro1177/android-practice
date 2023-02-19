package ru.mirea.tsybulko.layouttypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val startLayout = R.layout.linear_layout; // table_layout, constraint_layout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(startLayout)
    }
}