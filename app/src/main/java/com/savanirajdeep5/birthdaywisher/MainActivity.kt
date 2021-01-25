package com.savanirajdeep5.birthdaywisher

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun createBirthdayCard(view: View) {
        val editText = findViewById<EditText>(R.id.nameInput)
        val name = editText.editableText.toString()
//        Toast.makeText(this, "Name is $name ", Toast.LENGTH_LONG ).show()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}