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

import static com.example.android.quizapp.MainActivity.collectAns;

public class question4 extends AppCompatActivity {
    RadioButton b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        b1=(RadioButton)findViewById(R.id.A21);
        b2=(RadioButton)findViewById(R.id.A22);
        b3=(RadioButton)findViewById(R.id.A23);
    }

    public void nextA2(View view) {

        if(b1.isChecked()){
            collectAns.add("15");
        }
        else if(b2.isChecked()){
            collectAns.add("20");
        }
        else if(b3.isChecked()){
            collectAns.add("10");
        }else{
            collectAns.add("---");
        }

        Intent intent = new Intent(question4.this, question5.class);
        startActivity(intent);
        finish();
    }
}
