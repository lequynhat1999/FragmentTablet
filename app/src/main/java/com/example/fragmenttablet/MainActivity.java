package com.example.fragmenttablet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PassData{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(Student student) {
        FragmentStudentInfo fragmentStudentInfo = (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentStudentInfo);

        Configuration configuration = getResources().getConfiguration();
        if(fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            fragmentStudentInfo.SetInfo(student);

        }
        else
        {
            Intent intent = new Intent(MainActivity.this,StudentInfoActivity.class);
            intent.putExtra("DataStudent",student);
            startActivity(intent);
        }

//        if(fragmentStudentInfo != null && fragmentStudentInfo.isInLayout())
//        {
//            fragmentStudentInfo.SetInfo(student);
//
//        }
//        else
//        {
//            Intent intent = new Intent(MainActivity.this,StudentInfoActivity.class);
//            intent.putExtra("DataStudent",student);
//            startActivity(intent);
//        }
    }
}