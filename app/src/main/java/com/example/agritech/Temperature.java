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

public class Temperature extends AppCompatActivity {
    private ImageView backb;
    Switch switchButton;
    TextView t1;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

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

                    Toast.makeText(activity, "Sensor is ON", Toast.LENGTH_SHORT).show();
                    t1=findViewById(R.id.Value);
                    int min = 25;
                    int max = 35;
                    int b=(int)(Math.random()*(max-min+1)+min);
                    t1.setText("Temperature is "+b+"°C");

                } else {

                    Toast.makeText(activity, "Sensor is off", Toast.LENGTH_SHORT).show();
                    t1=findViewById(R.id.Value);
                    t1.setText("Sensor is off");
                }
            }
        });

    }
}