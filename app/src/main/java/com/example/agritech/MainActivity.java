package com.example.agritech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_temp =  findViewById(R.id.buttonTemp);
        button_temp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                startActivity(intent);
            }
        });

        Button button_hum =  findViewById(R.id.buttonHum);
        button_hum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Humidity.class);
                startActivity(intent);
            }
        });

        Button button_loc =  findViewById(R.id.buttonLoc);
        button_loc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        Button button_contact =  findViewById(R.id.buttonContact);
        button_contact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,ContactUs.class);
                startActivity(intent);
            }
        });
    }
}