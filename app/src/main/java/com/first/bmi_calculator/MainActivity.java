package com.first.bmi_calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.textview);
        TextInputEditText height= findViewById(R.id.height);
        TextInputEditText weight = findViewById(R.id.weight);
        Button calc= findViewById(R.id.Calculate);
        Button reset = findViewById(R.id.reset);
        height.setEnabled(true);
        weight.setEnabled(true);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(height.getText().toString());
                double w = Double.parseDouble(weight.getText().toString());
                double bmi=w/(h*h);
                bmi=bmi*10000;
                result.setText(Double.toString(bmi));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height.setText("");
                weight.setText("");
                result.setText("");
            }
        });
    }
}


