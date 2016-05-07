package com.example.thrinathd.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score_a = 0;
    private int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeIncrementerA(View view) {
        score_a += 3;
        displayA();
    }

    public void twoIncrementerA(View view) {
        score_a += 2;
        displayA();
    }

    public void freeThrowA(View view) {
        score_a += 1;
        displayA();
    }

    public void displayA(){
        TextView scoreText = (TextView)findViewById(R.id.a_point_val);
        scoreText.setText(String.valueOf(score_a));
    }

    public void threeIncrementerB(View view) {
        score_b += 3;
        displayB();
    }

    public void twoIncrementerB(View view) {
        score_b += 2;
        displayB();
    }

    public void freeThrowB(View view) {
        score_b += 1;
        displayB();
    }

    public void displayB(){
        TextView scoreText = (TextView)findViewById(R.id.b_point_val);
        scoreText.setText(String.valueOf(score_b));
    }

    public void resetCounter(View view){
        this.score_a = 0;
        this.score_b = 0;
        displayA();
        displayB();
    }
}
