package com.example.android.mathematicstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitOrder(View v) {
        score = 0;
        RadioButton two = (RadioButton) findViewById(R.id.questionOne_resultFour);
        if (two.isChecked()) {
            score += 20;
        }
        RadioButton seventeen = (RadioButton) findViewById(R.id.questionThree_resultFour);
        if (seventeen.isChecked()) {
            score += 20;
        }
        RadioButton eightyOne = (RadioButton) findViewById(R.id.questionFour_resultThree);
        if (eightyOne.isChecked()) {
            score += 20;
        }

        CheckBox elevenOne = (CheckBox) findViewById(R.id.questionTwo_resultOne);

        CheckBox six = (CheckBox) findViewById(R.id.questionTwo_resultTwo);

        CheckBox elevenTwo = (CheckBox) findViewById(R.id.questionTwo_resultThree);

        CheckBox twentyFive = (CheckBox) findViewById(R.id.questionTwo_resultFour);

        if (!six.isChecked() && !twentyFive.isChecked()) {
            if (elevenOne.isChecked()) {
                score += 10;
            }
            if (elevenTwo.isChecked()) {
                score += 10;
            }
        }
        EditText questionFive = (EditText) findViewById(R.id.questionFive_editText);
        final String text = questionFive.getText().toString();
        //比较输入内容与答案是否一样
        if (TextUtils.equals(text, "4")) {
            //答案相同加分
            score += 20;
        }
        Toast.makeText(this, "You got " + score + " points at last !", Toast.LENGTH_SHORT).show();
    }
}