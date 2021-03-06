package com.example.webviewfileupload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {
    // Sets splash screen time in miliseconds
    private static int SPLASH_TIME = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                // run() method will be executed when 3 seconds have passed

                //Time to start MainActivity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent );

                finish();
            }
        }, SPLASH_TIME);
    }
}
