package com.example.sakshigupta.my_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        Thread thread = new Thread(){
          @Override
          public void run(){
              try{
                  sleep(3000);
                  startActivity(new Intent(getApplicationContext(),MainActivity.class));
                  finish();
              }catch(Exception e){
                  e.printStackTrace();
              }
          }
        };thread.start();



    }
}