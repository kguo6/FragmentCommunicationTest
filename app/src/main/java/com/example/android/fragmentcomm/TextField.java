package com.example.android.fragmentcomm;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import org.w3c.dom.Text;

public class TextField extends Fragment implements View.OnClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_field,
                container, false);
        Button b = (Button)view.findViewById(R.id.text_field_button);
        b.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        if(view.getId() == R.id.text_field_button){
            EditText editText = getView().findViewById(R.id.editText);
            String message;
            message = editText.getText().toString();

            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            Fragment newFrag = new Fragment();
            newFrag.equals(new DisplayMessage());
            transaction.replace(R.id.content_fragment, newFrag);
            transaction.addToBackStack(null);
            TextView textView = view.findViewById(R.id.textView3);

            textView.setText("Hello");
            transaction.commit();

        }
    }



}
