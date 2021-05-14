package com.example.fragmenttablet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Student> arrStudent;

    public StudentAdapter(Context context, int layout, List<Student> arrStudent) {
        this.context = context;
        this.layout = layout;
        this.arrStudent = arrStudent;
    }

    @Override
    public int getCount() {
        return arrStudent.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder
    {
        TextView textViewInfo;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            viewHolder.textViewInfo = (TextView) convertView.findViewById(R.id.textViewInfo);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Student student = arrStudent.get(position);

        viewHolder.textViewInfo.setText(student.getName());

        return convertView;
    }
}
