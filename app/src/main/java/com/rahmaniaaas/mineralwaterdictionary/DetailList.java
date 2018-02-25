package com.rahmaniaaas.mineralwaterdictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailList extends AppCompatActivity {
    //inisiasi awal
    ImageView gambar, galon;
    TextView nama, detail, ukuran;
    int hitungl = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        //mengatur title bar
        setTitle("Detail Air Mineral");

        //mengambil nilai dari gambar, nama, detail, ukuran, battery yang ada pada layout
        gambar = findViewById(R.id.detailGambar);
        nama = findViewById(R.id.detailNama);
        detail = findViewById(R.id.detailDesc);
        ukuran = findViewById(R.id.liter);
        galon = findViewById(R.id.battery);


        //Mengambil atau get gambar
        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("gambar"))));
        //mengambil atau get text nama
        nama.setText(getIntent().getStringExtra("nama"));
        //mengambil atau get text detail
        detail.setText(getIntent().getStringExtra("detail"));
        //mengatur galon pada level terendah
        galon.setImageLevel(0);
    }

    //Jika button minus di klik
    public void minus(View view) {
        //apabila galon button minus dikurangi sampai satu tingkat sebelum level terendah
        if (galon.getDrawable().getLevel() - 1 >= 0) {
            //volume air akan dikurangi sebanyak 2 Liter
            hitungl=hitungl-2;
            //set text view dengan ukuran yang sudah dihitung
            ukuran.setText(hitungl + "L");
            //maka muncul galon satu tingkat sebelum level terendah
            galon.setImageLevel(galon.getDrawable().getLevel() - 1);
        } else {
            //apabila galon dikurangi sampai level paling rendah
            galon.setImageLevel(0);
            //maka akan muncul toast yang memberi tahu bahwa air hampir habis
            Toast.makeText(this, "Air Galon Hampir Habis !!!", Toast.LENGTH_LONG).show();
        }
    }

    //jika button plus di klik
    public void plus(View view) {
        //apabila galon ditambah sampai satu tingkat sebelum level tertinggi
        if (galon.getDrawable().getLevel() + 1 <=4) {
            //volume air akan ditambah sebanyak 2 liter
            hitungl=hitungl+2;
            //set text view dengan ukuran yang sudah dihitung
            ukuran.setText(hitungl + "L");
            //maka muncul galon satu tingkat sebelum level tertinggi
            galon.setImageLevel(galon.getDrawable().getLevel() + 1);
        } else {
            //apabila level battery penuh
            galon.setImageLevel(4);
            //maka akan muncul toast yang memberi tahu bahwa air sudah penuh
            Toast.makeText(this, "Air Galon Telah Full !!! ", Toast.LENGTH_LONG).show();
        }
    }
}