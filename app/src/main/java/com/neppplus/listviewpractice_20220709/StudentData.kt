package com.neppplus.listviewpractice_20220709

class StudentData (
    val name : String,
    val birthYear : Int,
    val address : String,
        ) {

    fun getKoreanAge () : Int {
        val koreanAge = 2022 - birthYear + 1
        return koreanAge
    }

}