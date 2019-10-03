package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class Profile extends AppCompatActivity {
    TextView receive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        receive = (TextView)findViewById(R.id.textView11);

        receive.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));
    }
}
