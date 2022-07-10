package com.neppplus.listviewpractice_20220709

import java.io.Serializable

class StudentData (
    val name : String,
    val birthYear : Int,
    val address : String,
        ) : Serializable {

    fun getKoreanAge () : Int {
        val koreanAge = 2022 - birthYear + 1
        return koreanAge
    }

}