package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button butt3 = (Button) findViewById(R.id.button);
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main4Activity.this, "Password Changed to 12345!",
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Main4Activity.this,
                        Main2Activity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }

}
