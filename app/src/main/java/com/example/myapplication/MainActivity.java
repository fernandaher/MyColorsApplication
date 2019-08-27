package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnCian).setOnClickListener(this);
        findViewById(R.id.btnOliveGreen).setOnClickListener(this);
        findViewById(R.id.btnGreen).setOnClickListener(this);
        findViewById(R.id.btnLilac).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int color;

        View contenedor = view.getRootView();

        switch (view.getId()) {
            case R.id.btnCian:
            color = Color.parseColor("#80CBC4");
            break;
            case R.id.btnOliveGreen:
            color = Color.parseColor("#A5D6A7");
            break;
            case R.id.btnGreen:
            color = Color.parseColor("#C5E1A5");
            break;
            case R.id.btnLilac:
            color = Color.parseColor("#E6EE9C");
            break;
            default:
                color = Color.DKGRAY;

        }

        contenedor.setBackgroundColor(color);
    }

}
