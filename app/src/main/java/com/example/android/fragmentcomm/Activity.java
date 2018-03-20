package com.example.android.fragmentcomm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView text = findViewById(R.id.textView4);
        text.setText(getIntent().getStringExtra("MESSAGE"));
    }
}
