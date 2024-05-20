package com.example.guidedexercise5;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public  class MainActivity extends AppCompatActivity {
    RadioButton red, blue, yellow, green;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        red = findViewById(R.id.rbRed);
        blue = findViewById(R.id.rbBlue);
        yellow = findViewById(R.id.rbYellow);
        green = findViewById(R.id.rbGreen);

        red.setOnClickListener(this::changeColor);
        blue.setOnClickListener(this::changeColor);
        yellow.setOnClickListener(this::changeColor);
        green.setOnClickListener(this::changeColor);
    }

    public void changeColor(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getResources().getResourceEntryName(view.getId())) {
            case "rbRed":
                if(checked)
                {
                    changeColor(Color.RED);
                    showSelectedColor();
                }
                break;
            case "rbBlue":
                if(checked)
                {
                    changeColor(Color.BLUE);
                    showSelectedColor();
                }
                break;
            case "rbYellow":
                if(checked)
                {
                    changeColor(Color.YELLOW);
                    showSelectedColor();
                }
                break;
            case "rbGreen":
                if(checked)
                {
                    changeColor(Color.GREEN);
                    showSelectedColor();
                }
                break;
        }

    }
    public void changeColor(int color){
        getWindow().getDecorView().setBackgroundColor(color);
    }

    public void showSelectedColor() {
        if (red.isChecked()) {
            Toast.makeText(getApplicationContext(), "Color: RED", Toast.LENGTH_SHORT).show();
        }
        if (blue.isChecked()) {
            Toast.makeText(getApplicationContext(), "Color: BLUE", Toast.LENGTH_SHORT).show();
        }
        if (yellow.isChecked()) {
            Toast.makeText(getApplicationContext(), "Color: YELLOW", Toast.LENGTH_SHORT).show();
        }
        if (green.isChecked()) {
            Toast.makeText(getApplicationContext(), "Color: GREEN", Toast.LENGTH_SHORT).show();
        }
    }



}