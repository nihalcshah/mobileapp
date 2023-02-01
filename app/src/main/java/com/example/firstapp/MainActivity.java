package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    Switch simpleSwitch1;
    TextView urmom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleSwitch1 = (Switch) findViewById(R.id.simpleSwitch1);
         urmom = (TextView) findViewById(R.id.testtext);

    }

    public void changeColor(View view) {
        if (((Switch)view).isChecked())
            urmom.setTextColor(Color.GREEN);//set background color
        else
            urmom.setTextColor(Color.BLACK);//set background color
    }
}