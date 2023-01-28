package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    Button btn_quitter,btn_reinitialiser;
    EditText Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);
        btn_quitter = findViewById(R.id.btnquitter);
        btn_reinitialiser=findViewById(R.id.btnreinitialiser);
        Number=findViewById(R.id.txtNumber);

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
    }
}