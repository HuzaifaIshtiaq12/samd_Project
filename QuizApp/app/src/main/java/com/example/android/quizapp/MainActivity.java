package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioButton b1,b2,b3;
    static ArrayList<String> correctAns = new ArrayList<String>(){
        {
            add("20");
            add("36");
            add("20");
            add("10");
            add("23");
            add("64");
            add("08");
            add("28");
            add("09");
            add("99");
        }
    };
    static ArrayList<String> collectAns= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(RadioButton)findViewById(R.id.A1q1);
        b2=(RadioButton)findViewById(R.id.A1q2);
        b3=(RadioButton)findViewById(R.id.A1q3);
    }

    public void nextA1(View view) {

        if(b1.isChecked()){
            collectAns.add("23");
        }
        else if(b2.isChecked()){
            collectAns.add("25");
        }
        else if(b3.isChecked()){
            collectAns.add("20");
        }else{
            collectAns.add("---");
        }

        Intent intent = new Intent(MainActivity.this, newActivity.class);
        startActivity(intent);
        finish();
    }
}
