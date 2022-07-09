package com.neppplus.listviewpractice_20220709.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20220709.R
import com.neppplus.listviewpractice_20220709.StudentData

class StudentListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

}