package com.savanirajdeep5.birthdaywisher

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name= intent.getStringExtra(NAME_EXTRA)
        val birthdaygreeting = findViewById<TextView>(R.id.birthdayGreeting)
        birthdaygreeting.text = "Happy Birthday \n$name !!"
    }
}
