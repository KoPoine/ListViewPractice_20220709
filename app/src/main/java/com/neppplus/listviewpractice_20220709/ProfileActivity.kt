package com.neppplus.listviewpractice_20220709

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val studentData = intent.getSerializableExtra("studentData") as StudentData

        nameTxt.text = studentData.name
        ageTxt.text = "${studentData.getKoreanAge()}세"
        addressTxt.text = studentData.address
    }
}