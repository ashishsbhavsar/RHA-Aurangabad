package com.robinhoodarmy.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView reg;
    CardView cowin;
    CardView covishield;
    CardView covaxin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg = (CardView) findViewById(R.id.reg);
        cowin = (CardView)findViewById(R.id.cowin);
        covishield = (CardView)findViewById(R.id.covishield);
        covaxin = (CardView)findViewById(R.id.covaxin);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regestration = new Intent(MainActivity.this,regestration.class);
                startActivity(regestration);
                Toast.makeText(MainActivity.this,"Please wait till Form loading",Toast.LENGTH_SHORT).show();
            }
        });

        cowin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cowin = new Intent(MainActivity.this,cowin.class);
                startActivity(cowin);
                Toast.makeText(MainActivity.this,"Please wait till Form loading",Toast.LENGTH_SHORT).show();
            }
        });

        covishield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent covishield = new Intent(MainActivity.this,covishield.class);
                startActivity(covishield);
                Toast.makeText(MainActivity.this,"Please wait till Form loading",Toast.LENGTH_SHORT).show();
            }
        });

        covaxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent covaxin = new Intent(MainActivity.this,covaxin.class);
                startActivity(covaxin);
                Toast.makeText(MainActivity.this,"Please wait till Form Loading",Toast.LENGTH_SHORT).show();
            }
        });
        
    }
}