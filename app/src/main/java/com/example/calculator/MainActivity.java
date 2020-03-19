package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private CalculatorModel calculator;
private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] numbersId = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine

        };
        int[] actionsId =  new int[]{
          R.id.plus,
          R.id.minus,
          R.id.division,
          R.id.multiplication,
                R.id.equals

        };
text = findViewById(R.id.text);
        calculator = new CalculatorModel();

        View.OnClickListener numberButtonClickListener =new View.OnClickListener(){

            @Override
            public void onClick(View view) {
calculator.onNumPressed(view.getId());

text.setText(calculator.getText());
            }
        };

        View.OnClickListener actionButtonOneClickListener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                calculator.onActionPressed(view.getId());
                text.setText(calculator.getText());

            }
        };
        for (int i = 0; i < numbersId.length; i++) {
findViewById(numbersId[i]).setOnClickListener(numberButtonClickListener);
        }
        for (int i = 0; i < actionsId.length ; i++) {
            findViewById(actionsId[i]).setOnClickListener(actionButtonOneClickListener);
        }
    }
}
