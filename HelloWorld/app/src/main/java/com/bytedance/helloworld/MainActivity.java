package com.bytedance.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        final TextView tv1=findViewById(R.id.tv1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Welcome to my world!");
                Log.d("MainActivity" ,"world");
            }
        });

        CheckBox cb1 = findViewById(R.id.cb1);
        final TextView tv2=findViewById(R.id.tv1);
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Glad to see you!");
                Log.d("MainActivity","you");
            }
        });

        Switch sw1 = findViewById(R.id.sw1);
        final TextView tv3=findViewById(R.id.tv1);
        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv3.setText("Goodbye! My friend!");
                Log.d("MainActivity","friend");
            }
        });

        Log.d(TAG, "MainActivity");
    }
}
