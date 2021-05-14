package com.example.fragmenttablet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentStudentInfo extends Fragment {
    TextView textViewName,textViewYear,textViewAddress,textViewEmail;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_student_info,container,false);
        Mapping();

        return view;
    }

    public void SetInfo(Student student)
    {
        textViewName.setText(student.getName());
        textViewYear.setText(student.getYear() + "");
        textViewAddress.setText(student.getAddress());
        textViewEmail.setText(student.getEmail());
    }

    private void Mapping()
    {
        textViewName = (TextView) view.findViewById(R.id.textViewName);
        textViewYear = (TextView) view.findViewById(R.id.textViewYear);
        textViewAddress = (TextView) view.findViewById(R.id.textViewAddress);
        textViewEmail = (TextView) view.findViewById(R.id.textViewEmail);
    }

}
