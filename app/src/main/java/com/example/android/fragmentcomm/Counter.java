package com.example.android.fragmentcomm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class Counter extends Fragment implements View.OnClickListener{
    public static Integer counter = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.counter,
                container, false);
        ImageButton b = (ImageButton)view.findViewById(R.id.imageButton);
        b.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageButton){
            TextView textView = getView().findViewById(R.id.counterText);
            textView.setText((counter+=1).toString());
        }
    }
}
