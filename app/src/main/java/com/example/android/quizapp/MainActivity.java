package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox wan1, wan2, wan3, wan4, wan5, wan6;
    int score, ans1, ans2, ans3;
    private Button chkResultsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup q1rg1 = (RadioGroup) findViewById(R.id.q1_rgrp1);
        q1rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.q1_r1:
                        ans1 = 1;
                        break;
                    case R.id.q1_r2:
                        ans1 = 2;
                        //add score;
                        break;
                    case R.id.q1_r3:
                        ans1 = 3;
                        break;
                    case R.id.q1_r4:
                        ans1 = 4;
                        break;
                }
            }
        });

        RadioGroup q2rg2 = (RadioGroup) findViewById(R.id.q2_rgrp2);
        q2rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.q2_r1:
                        ans2 = 1;
                        break;
                    case R.id.q2_r2:
                        ans2 = 2;
                        break;
                    case R.id.q2_r3:
                        ans2 = 3;
                        //add score
                        break;
                    case R.id.q2_r4:
                        ans2 = 4;
                        break;
                }
            }
        });

        final Context currentContext = this;
        Button chkResultsButton = (Button) findViewById(R.id.btn_chkResults);
        chkResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                if (ans1 == 2)
                    score++;
                if (ans2 == 3)
                    score++;
                if (ans3 == 1)
                    score++;
                //Display results
                Toast.makeText(currentContext, "You answered " + score + " questions correctly!", Toast.LENGTH_LONG).show();
            }
        });


    }


}


