package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id for the calculator and total
        TextView cal =findViewById(R.id.Calculator);
        TextView total =findViewById(R.id.total);

        // id for the first and second number
        EditText first =findViewById(R.id.first);
        EditText Second =findViewById(R.id.second);

        // id for the calculate button
        Button duck =findViewById(R.id.quack);

    }
}