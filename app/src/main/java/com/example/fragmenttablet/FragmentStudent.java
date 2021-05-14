package com.example.fragmenttablet;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentStudent  extends ListFragment {
    StudentAdapter adapter;
    ArrayList<Student> arrStudent;
    PassData passData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        passData = (PassData) getActivity();
        arrStudent = new ArrayList<>();
        AddArr();
        adapter = new StudentAdapter(getActivity(),R.layout.row_student,arrStudent);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_student,container,false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        passData.DataStudent(arrStudent.get(position));
    }

    private  void AddArr()
    {
        arrStudent.add(new Student("Nhat",1999,"Nam dinh","lequynhat"));
        arrStudent.add(new Student("Trang",1999,"Nam dinh","lequynhat"));
        arrStudent.add(new Student("Nam",1999,"Nam dinh","lequynhat"));
        arrStudent.add(new Student("Dat",1999,"Nam dinh","lequynhat"));
        arrStudent.add(new Student("Thang",1999,"Nam dinh","lequynhat"));
        arrStudent.add(new Student("Hai",1999,"Nam dinh","lequynhat"));
        arrStudent.add(new Student("Hoa",1999,"Nam dinh","lequynhat"));
    }

}
