package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    Button btn_quitter,btn_reinitialiser;
    EditText Number;
    Button color1,color2,color3;

    public void setMyScreenColor(int color){
        View vw=this.getWindow().getDecorView();
        vw.setBackgroundColor(color);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);
        btn_quitter = findViewById(R.id.btnquitter);
        btn_reinitialiser=findViewById(R.id.btnreinitialiser);
        Number=findViewById(R.id.txtNumber);
        color1=findViewById(R.id.white);
        color2=findViewById(R.id.blue);
        color3=findViewById(R.id.black);

        btn_quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

        btn_reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(null);
            }
        });

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.WHITE);
            }
        });
        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.argb(100,26,35,126));
            }
        });
        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.BLACK);
            }
        });

    }
}