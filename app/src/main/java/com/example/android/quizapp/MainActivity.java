package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     int score=0;

     RadioGroup ques1;
     RadioGroup ques3;
     RadioGroup ques4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ques1 = findViewById(R.id.ques1_radio);
        ques3 = findViewById(R.id.ques3_radio);
        ques4 = findViewById(R.id.ques4_radio);
    }

    public void ButtonClick(View view) {
        String ans1 = ((RadioButton) findViewById(ques1.getCheckedRadioButtonId())).getText().toString();
        if (ans1.equalsIgnoreCase("Valentine's Day")) {
            score = score + 1;
        }
        else
        {
            score = score;
        }
        if (((EditText) findViewById(R.id.card2_et)).getText().toString().equalsIgnoreCase("Apoorva Tiwari")) {
            score = score + 1;
        }
        else
        {
            score =score;
        }

        String ans3 = ((RadioButton) findViewById(ques3.getCheckedRadioButtonId())).getText().toString();;
        if (ans3.equalsIgnoreCase("6")) {
            score = score + 1;
        }
        else
        {
            score = score;
        }

        String ans4 = ((RadioButton) findViewById(ques4.getCheckedRadioButtonId())).getText().toString();
        if (ans4.equalsIgnoreCase("Ask me Anything"))
        {
            score = score + 1;
        }
        else
        {
            score = score;
        }


        CheckBox q5CB2 = (CheckBox) findViewById(R.id.card5_ch2);
        boolean chk2 = q5CB2.isChecked();

        CheckBox q5CB3 = (CheckBox) findViewById(R.id.card5_ch3);
        boolean chk3 = q5CB3.isChecked();

        boolean right_ans = chk2 && chk3;
        if (right_ans) {
            score = score + 1;

        }
        else
        {
            score = score;
        }

        Toast.makeText(this, "Your Scored " + score + " out of 5", Toast.LENGTH_SHORT).show();

        }
}
