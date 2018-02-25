package com.rahmaniaaas.mineralwaterdictionary;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SpalshScreen extends AppCompatActivity {
    //set waktu lamanya splashscreen
    private static int splashInterval = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Membuat splashcreen tayangnya full layout tanpa proggress bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_spalsh_screen);

        //Membuat Toast
        Toast.makeText(SpalshScreen.this,"WELCOME, YOU !!!",Toast.LENGTH_LONG).show();


        new Handler().postDelayed(new Runnable() {


                                      @Override
                                      public void run() {
                                          // TODO Auto-generated method stub

                                          // menghubungkan activity splashscren ke main activity dengan intent
                                          Intent intent = new Intent(SpalshScreen.this, MainActivity.class);
                                          startActivity(intent);


                                          //jeda selesai Splashscreen
                                          this.finish();
                                      }

                                      private void finish() {
                                          // TODO Auto-generated method stub

                                      }
                                  }, //menjalankan timer yang splash screen yang sudah di setting di atas
                splashInterval);

    };
}
