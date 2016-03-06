package com.example.caspertofte.multiplier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SimpleMultiplier extends AppCompatActivity {

    public int number = 0;
    public int result_nbr = 0;

    // Decrements and displays the number when "-" button is pressed.
    public void decrement(View view){
        number = number - 1;
        TextView displaydecrement = (TextView) findViewById(R.id.txt_showNumber);
        displaydecrement.setText(" " + number);
    }

    // Increments and displays the number when "+" button is pressed.
    public void increment(View view){
        number = number + 1;
        TextView displayincrement = (TextView) findViewById(R.id.txt_showNumber);
        displayincrement.setText(" " + number);
    }

    // Multiplies the number by 3 and displays the result.
    public void calculate(View view){
        result_nbr = number * 3;
        TextView myTextViewcal = (TextView) findViewById(R.id.txt_resultText);
        myTextViewcal.setText(" " + result_nbr);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_multiplier);
    }
}