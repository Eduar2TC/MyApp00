package com.example.myapp00;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


public class SplashLogo extends AppCompatActivity {

    public void tiempoSplash(){
        TimerTask tiempoTarea = new TimerTask() {
            @Override
            public void run() {
                //llamar activity main
                Intent intent = new Intent(SplashLogo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tiempoTarea, 5000);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_logo);
        this.tiempoSplash();
        //setContentView(R.layout.activity_main);

    }
}