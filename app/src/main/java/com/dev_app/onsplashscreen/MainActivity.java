package com.dev_app.onsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*The splash is use as a transition from one activity to another
 *This is very helpful to give your app a cool display whenever users open it.--- Created by Dayo Jaiye (D++) */

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000; // Setting the seconds (4s) -Step 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Call the Handler (Step2)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
