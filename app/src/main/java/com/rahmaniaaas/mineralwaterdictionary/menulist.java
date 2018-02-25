package com.rahmaniaaas.mineralwaterdictionary;

/**
 * Created by USER on 25/02/2018.
 */

public class menulist {
    //inisiasi variable yang akan digunakan

    int gambar;
    String nama;
    String desc;

    //method set
    public menulist(int gambar, String nama, String desc){
        this.gambar=gambar;
        this.nama=nama;
        this.desc=desc;
    }
    //method get untuk mengambil gambar
    public int getGambar() {
        return gambar;
    }

    //method get untuk mengambil nama
    public String getNama() {
        return nama;
    }

    //method get untuk mengambil detail
    public String getDesc() {
        return desc;
    }

}
