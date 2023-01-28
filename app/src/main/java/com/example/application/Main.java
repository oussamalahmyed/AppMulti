package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {
    Button btn_quitter,btn_reinitialiser,btn_afficher;
    EditText Number;
    Button color1,color2,color3;
    TextView tv;

    public void setMyScreenColor(int color){
        View v=this.getWindow().getDecorView();
        v.setBackgroundColor(color);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);
        btn_quitter = findViewById(R.id.btnquitter);
        btn_reinitialiser=findViewById(R.id.btnreinitialiser);
        Number=findViewById(R.id.txtNumber);
        btn_afficher=findViewById(R.id.btnafficher);
        color1=findViewById(R.id.white);
        color2=findViewById(R.id.blue);
        color3=findViewById(R.id.black);
        tv=findViewById(R.id.tview);
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
                tv.setText("? * 1 =?\n ? * 2 =?\n ? * 3 =?\n ? * 4 =?\n ? * 5 =?\n ? * 6 =?\n ? * 7 =?\n ? * 8 =?\n ? * 9 =?\n ? * 10 =?");
            }
        });

        Toast To;
        To = Toast.makeText(Main.this,"Enter un number!!",Toast.LENGTH_SHORT);

        btn_afficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    int N = Integer.parseInt(Number.getText().toString());
                    String show="";
                    for (int i=1;i<=10;i++) {
                        int m= N*i;
                        show+=String.format(" %d*%d=%d \n",N,i,m);
                        m=0;

                    }
                    tv.setText(show);



                }catch (NumberFormatException e){
                    btn_reinitialiser.callOnClick();

                    To.show();
                }

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