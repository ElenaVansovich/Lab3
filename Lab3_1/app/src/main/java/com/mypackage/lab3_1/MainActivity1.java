package com.mypackage.lab3_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void onClick2(View v){
        Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
        startActivity(intent);

    }

    public void onClick3(View v){
        Intent intent = new Intent(MainActivity1.this, MainActivity3.class);
        startActivity(intent);

    }
    public void onClick4(View v){
        Intent intent = new Intent(MainActivity1.this, MainActivity4.class);
        startActivity(intent);

    }
    public void onClick5(View v){
        System.exit(0);
    }
}
