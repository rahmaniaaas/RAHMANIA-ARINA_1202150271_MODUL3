package com.rahmaniaaas.mineralwaterdictionary;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainList extends AppCompatActivity {

    RecyclerView mrecycle;
    ListAdapter mAdapter;
    List<menulist> listminum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_list);
        //mengatur title bar menjadi Dafter Air Mineral
        setTitle("Daftar Air Mineral");

        //membuat array list baru dengan nama listminum
        listminum = new ArrayList<menulist>();
        //set recyleview
        mrecycle = findViewById(R.id.recyclerview);
        mrecycle.setHasFixedSize(true);
        //kondisi ketika orientasi menjadi landscape
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //maka akan menampilkan 2 grid tampilan
            mrecycle.setLayoutManager(new GridLayoutManager(MainList.this, 2));
            //jika orientasi menjadi portrait
        }else {
            //maka akan menampilkan satu grid tampilan saja
            mrecycle.setLayoutManager(new GridLayoutManager(MainList.this, 1));
        }

        inputdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            mrecycle.setLayoutManager(new GridLayoutManager(MainList.this, 2));
        }else {
            mrecycle.setLayoutManager(new GridLayoutManager(MainList.this, 1));
        }
    }

    public void inputdata(){
        //memasukkan data ke dalam array
        listminum.add(new menulist(R.drawable.ades, "ADES", "Ini adalah air mineral merk Ades. \nMerupakan merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang."));
        listminum.add(new menulist(R.drawable.amidis,"AMIDIS", "Ini adalah air mineral merk Amidis. \nMerupakan air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida."));
        listminum.add(new menulist(R.drawable.aqua, "AQUA", "Ini adalah air mineral merk Aqua. \nMerupakan merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei."));
        listminum.add(new menulist(R.drawable.cleo, "CLEO", "Ini adalah air mineral merk Cleo. \nMerupakan air mineral yang diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride."));
        listminum.add(new menulist(R.drawable.club, "CLUB", "Ini adalah air mineral merk Club. \nMerupakan merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk."));
        listminum.add(new menulist(R.drawable.equil, "EQUIL", "Ini adalah air mineral merk Equil. \nMerupakan merek air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto. Untuk lokasi industrinya berada di Vila D’Equilibrium, dan pabrik pengemasan Equil terletak di kaki Gunung Salak, Sukabumi, Jawa Barat."));
        listminum.add(new menulist(R.drawable.evian, "EVIAN", "Ini adalah air mineral merk Evian. \nMerupakan merek air mineral alami berasal dari satu sumber di puncak pegunungan Alpen, Perancis. Setiap tetesnya melewati perjalanan dan proses alam selama 15 tahun sebelum muncul di mata air. Pembentukan mineral terjadi selama proses alami tersebut, melewati lapisan es dan bebatuan, dalam komposisi yang unik. "));
        listminum.add(new menulist(R.drawable.leminerale, "LE MINERALE", "Ini adalah air mineral merk leMinerale. \nMerupakan merek air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis."));
        listminum.add(new menulist(R.drawable.nestle, "NESTLE", "Ini adalah air mineral merk Nestle. \nMerupakan air mineral yang berasal dari segala kemurnian mata air pilihan dan diproses secara higienis. Spesifikasi Produk. Jenis Produk: Air Mineral. Isi: 1500ml."));
        listminum.add(new menulist(R.drawable.pristine, "PRISTINE", "Ini adalah air mineral merk Pristine. \nMerupakan air minum yang bersih adalah air minum beralkali yang di proses ionisasi, air minum pristine adalah air alkali dengan ph 8 yang bermanfaat untuk kesehatan, air minum kemasan praktis dan ekonomis."));
        listminum.add(new menulist(R.drawable.vit, "VIT", "Ini adalah air mineral merk Vit. \nMerupakan merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta."));
        //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
        mAdapter = new ListAdapter(this, listminum);
        //menguhubungkan recycler view dengan adapter
        mrecycle.setAdapter(mAdapter);
    }
}