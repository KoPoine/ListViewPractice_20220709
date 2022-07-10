package com.neppplus.listviewpractice_20220709

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.listviewpractice_20220709.adapters.StudentListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    ArrayList로 목록 공간을 만들어주고
    val mStudentList = ArrayList<StudentData>()

//    어댑터 클래스 멤버변수화
    lateinit var mStudentListAdapter : StudentListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        학생 데이터 (더미 데이터 생성)
//        StudentData(~~~)라는 학생 데이터 객체들을 생성
//        ArrayList에 추가(mStudentList.add)
        mStudentList.add(StudentData("김민철",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철2",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철3",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철4",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철5",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철6",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철7",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철8",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철9",1990,"서울시 서대문구"))
        mStudentList.add(StudentData("김민철10",1990,"서울시 서대문구"))

//        실제 어댑터와 ArrayList를 연결(어댑터 클래스를 객체화)
        mStudentListAdapter = StudentListAdapter(this, R.layout.student_list_item, mStudentList)
//        액티비티 화면의 listView 태그와 adapter를 연결
        mainListView.adapter = mStudentListAdapter

//        리스트뷰 한줄에 대한 클릭 이벤트 처리
        mainListView.setOnItemClickListener { adapterView, view, position, l ->
            val myIntent = Intent(this, ProfileActivity::class.java)
            myIntent.putExtra("studentData", mStudentList[position])
            startActivity(myIntent)
        }
        
//        리스트뷰 한줄에 대한 롱클릭 이벤트 처리
        mainListView.setOnItemLongClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "${i}번째 아이템 롱클릭 이벤트", Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener(true)
        }
    }
}