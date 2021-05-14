package com.example.fragmenttablet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        Intent intent = getIntent();
        Student student = (Student) intent.getSerializableExtra("DataStudent");

        FragmentStudentInfo studentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentInfo);
        studentInfo.SetInfo(student);
    }
}