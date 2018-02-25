package com.rahmaniaaas.mineralwaterdictionary;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //inisiasi awal
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memasukkan data
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void Login(View view) {
        //memanggil data
        String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();

        if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")){
            //jika login berhasil
            Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_SHORT).show(); //toast
            Intent intent1 = new Intent(MainActivity.this, MainList.class); //pindah ke activity selanjutnya
            MainActivity.this.startActivity(intent1);
            finish();
        }else {
            //jika login gagal terdapat alert
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Coba Lagi", null).create().show();
        }
    }

}
