package com.example.android.fragmentcomm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayMessage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.message_display,
                container, false);
        Fragment frag = getParentFragment();
        TextView text =  view.findViewById(R.id.textView3);

        if(getArguments().getString("SubmittedString") != null)
        text.setText(getArguments().getString("SubmittedString"));

        return view;
    }

}
