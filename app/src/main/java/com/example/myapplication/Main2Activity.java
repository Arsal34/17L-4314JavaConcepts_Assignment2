package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText SendValue;
    EditText SendValue2;
    TextView receive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button butt1 = (Button) findViewById(R.id.bt3);
        Button butt2 = (Button) findViewById(R.id.button);
        Button butt3 = (Button) findViewById(R.id.button3);  //forgotPassword
        SendValue = (EditText)findViewById(R.id.editText);
        SendValue2 = (EditText)findViewById(R.id.editText4);

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,
                        Main4Activity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });

       // receive.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));
        butt2.setOnClickListener(new View.OnClickListener()
                                 {

                                     public void onClick(View view2) {
                                         if( SendValue.getText().toString().isEmpty() ){

                                             /**
                                              *   You can Toast a message here that the Username is Empty
                                              **/

                                             SendValue.setError( "Fill the above Fields!" );

                                         }
                                         else if( SendValue2.getText().toString().isEmpty())
                                         {

                                             SendValue2.setError( "Fill the above Fields!" );

                                         }
                                         else {
                                             Intent intent = new Intent(Main2Activity.this,
                                                     Profile.class);
                                             // intent.putExtra("EdiTtEXTvALUE", SendValue.getText().toString());
                                             startActivity(intent); // startActivity allow you to move

                                         }
                                     }
                                 }
        );
        butt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view2) {
                Intent intent = new Intent(Main2Activity.this,
                        MainActivity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });

    }


}
