package ru.polypaps.project_two

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val rnd = Random
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_resulte.setOnClickListener{ checkGay() }
    }

    @SuppressLint("SetTextI18n")
    fun checkGay() {
        val result = rnd.nextInt(0,1000).toString()
        textView_resulte.text = "$result.0 %"
    }
}