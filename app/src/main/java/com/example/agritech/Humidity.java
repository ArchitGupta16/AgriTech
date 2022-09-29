package com.example.agritech;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.time.temporal.ValueRange;
import java.util.Random;

public class Humidity extends AppCompatActivity {
    private ImageView backb;
    Switch switchButton;
    TextView t1;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humidity);

        backb = findViewById(R.id.backB);
        backb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        activity = this;

        switchButton = (Switch) findViewById(R.id.ONOFF);
        switchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (switchButton.isChecked()) {

                    Toast.makeText(activity, "Sensor is ON", Toast.LENGTH_LONG).show();
                    t1=findViewById(R.id.Value);
                    int min = 60;
                    int max = 90;
                    int b=(int)(Math.random()*(max-min+1)+min);
                    t1.setText("Humidity is "+b+"%");

                } else {

                    Toast.makeText(activity, "Sensor is off", Toast.LENGTH_LONG).show();
                    t1=findViewById(R.id.Value);
                    t1.setText("Sensor is off");
                }
            }
        });

    }
}