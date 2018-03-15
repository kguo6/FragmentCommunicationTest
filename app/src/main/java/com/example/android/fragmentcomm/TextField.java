package com.example.android.fragmentcomm;




import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class TextField extends Fragment implements View.OnClickListener{
    public TextField(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_field,
                container, false);
        Button b = (Button)view.findViewById(R.id.text_field_button);
        b.setOnClickListener(this);
        return view;
    }

    public interface FragmentCommunication{
        public String getMessage();
    }
    @Override
    public void onClick(View view){
        if(view.getId() == R.id.text_field_button){

        }
    }


}
