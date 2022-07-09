package com.neppplus.listviewpractice_20220709

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra("name")
        val birthYear = intent.getIntExtra("birthYear",0)
        val address = intent.getStringExtra("address")

        nameTxt.text = name
        ageTxt.text = birthYear.toString()
        addressTxt.text = address
    }
}