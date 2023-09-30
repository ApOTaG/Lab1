package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView MainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.MainText = findViewById(R.id.MainText);
    }

    public void ChangeButtonClick(View view) {
        this.MainText.setText("Hello! :)");
    }

    public void ColorBtnClick(View view) {
        MainText.setTextColor(Color.rgb(200,0,0));
    }
}
