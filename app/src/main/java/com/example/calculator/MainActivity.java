package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonSumClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView)findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double resSum = num1 + num2;
        result.setText(Double.toString((int) resSum));

    }

    public void onButtonMinusClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView)findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double resSum = num1 - num2;
        result.setText(Double.toString(resSum));

    }

    public void onButtonMultipyClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView)findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double resSum = num1 * num2;
        result.setText(Double.toString(resSum));

    }

    public void onButtonDivisionClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView)findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double resSum = num1 / num2;
        result.setText(Double.toString(resSum));

    }

    public void onButtonExpanentClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView)findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double resSum = Math.pow(num1,num2);
        result.setText(Double.toString(resSum));

    }

    public void onButtonSqrtClick(View v){
        EditText el1 = (EditText)findViewById(R.id.num1);
        EditText el2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView)findViewById(R.id.result);

        double num1 = Double.parseDouble(el1.getText().toString());
        double num2 = Double.parseDouble(el2.getText().toString());
        double resSum = Math.pow(num1,1/num2);
        result.setText(Double.toString(resSum));

    }

}