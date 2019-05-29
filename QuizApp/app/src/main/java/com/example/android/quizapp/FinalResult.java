package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.quizapp.MainActivity.collectAns;
import static com.example.android.quizapp.MainActivity.correctAns;

public class FinalResult extends AppCompatActivity {
    int totalQ;
    int c,w=0;
    LinearLayout layout;
    TextView correct,wrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);
        totalQ=collectAns.size();
        layout=(LinearLayout)findViewById(R.id.Layout);
        correct=(TextView) findViewById(R.id.correct);
        wrong=(TextView) findViewById(R.id.wrong);


        for (int i = 0; i < totalQ; i++) {
            TextView rowTextView = new TextView(this);
            rowTextView.setTextSize(18);
            rowTextView.setText("         "+correctAns.get(i)+"                                    " +collectAns.get(i));
            if(correctAns.get(i).equals(collectAns.get(i))){
                c=c+1;
            }else{
                w=w+1;
            }

            layout.addView(rowTextView);
        }
        correct.setText("Correct Answers: "+c);
        wrong.setText("Wrong Answers: "+w);
    }
}
