package com.example.carilokasi;



import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
 
public class Test extends ListActivity {
 
    private String[] Judul = new String[] { "SPBU 31.164.01", "SPBU 34.164.02", "SPBU 34.164.03", "SPBU 34.164.04", "SPBU 34.164.06", "SPBU 34.164.08",  
    		"SPBU 34.164.10", "SPBU 34.164.11", "SPBU 34.164.12", "SPBU 34.164.13", "SPBU 34.164.14", "SPBU 34.164.16", "SPBU 34.164.17", 
    		"SPBU 34.164.20",  "SPBU 34.165.03",  "SPBU 34.165.05", "SPBU 34.165.06", "SPBU 34.165.08", "SPBU 34.165.09", "SPBU 34.165.11", 
    		"SPBU 34.165.12",  "SPBU 34.169.09",  "SPBU 34.169.10", "SPBU 34.169.15", "SPBU 34.169.19",  "SPBU 34.169.24",  "SPBU 34.169.32", "SPBU 34.169.51"};
    
    private String[] subJudul = new String[] { "Jl. Margonda Raya,Beji,Kota Depok, Jawa Barat 16424, Indonesia", "Jl. Margonda Raya No.328,Beji,Kota Depok, Jawa Barat 16424,Indonesia", "Jl. Raya Sawangan,Pancoran MAS,Kota Depok, Jawa Barat 16435,Indonesia", "Jl. Raya Siliwanggi Depok, Jawa Barat", "Jl. Margonda Raya,Beji,Kota Depok, Jawa Barat 16423,Indonesia", "Jl. Raya Citayam,Cipayung,Kota Depok, Jawa Barat 16431,Indonesia",  
    		"Jl. IR. H. Juanda,Sukmajaya,Kota Depok, Jawa Barat 16416,Indonesia", "Jl. Raya Kartini,Pancoran MAS,Kota Depok, Jawa Barat 16431,Indonesia", "Jl. H Asmawi Beji Depok, Jawa Barat", "Jl. Raya Pitara Pancoran Mas Depok, Jawa Barat", "Jl. Jati Mulya Kp.Sawah Depok, Jawa Barat", "Jl. Tole Iskandar Depok, Jawa Barat", "Pd. Cina,Beji,Kota Depok, Jawa Barat 16424,Indonesia", 
    		"Jl. Raya Cipayung,Jawa Barat,Indonesia", "Jl.cinere raya Depok, Jawa Barat",  "Jl.raya cinere Depok, Jawa Barat", "Bojongsari Lama,Sawangan,Kota Depok, Jawa Barat 16516,Indonesia","Jl. Raya Gandul,Cinere,Kota Depok, Jawa Barat 16514,Indonesia", "Jl.raya Muhtar Depok, Jawa Barat", "Jl. Muchtar Raya,Sawangan,Kota Depok, Jawa Barat 16511,Indonesia", 
    		"Jl. Raya Limo No.36, Limo Depok, Jawa Barat",  "Jl. Raya Jak - Bogor,Cimanggis,Kota Depok, Jawa Barat 16416,Indonesia",  "Jl. Akses UI ,Cimanggis, Depok City, Indonesia 12640, Indonesia", "Jl.Komp.Bumi Perkemahan Cibubur Depok, Jawa Barat", "Jl. Tapos Raya,Tapos,Kota Depok, Jawa Barat 16457,Indonesia",  "Jl.Raya Bogor ds.Tugu Cimanggis Depok, Jawa Barat",  "Jl.Harjamukti Depok, Jawa Barat", "Jl.Tugu,Cimanggis, Kota Depok, Jawa Barat 16951, Indonesia"};
    
    private int[] Gambar = new int[28];
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "DAFTAR SPBU");
        prosesIsiData();
        ListAdapter adapter = new ListAdapter(getBaseContext(), Judul,
                subJudul, Gambar);
        
        setListAdapter(adapter);
    }
 
    private void prosesIsiData() {
        for (int i = 0; i < Gambar.length; i++) {
            Gambar[i] = R.drawable.dua;
        }
    }
 
    // Method untuk mengeluarkan event saat list di click
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	if(position == 0){
            Intent i = getIntent();
            i = new Intent (this,Pom1.class);
            startActivity(i);
     }
     
    	else if(position == 1){
            Intent i = getIntent();
            i = new Intent (this,Pom2.class);
            startActivity(i);
    	}
    	else if(position == 2){
            Intent i = getIntent();
            i = new Intent (this,Pom3.class);
            startActivity(i);
    	}
    	else if(position == 3){
            Intent i = getIntent();
            i = new Intent (this,Pom4.class);
            startActivity(i);
    	}
    	else if(position == 4){
            Intent i = getIntent();
            i = new Intent (this,Pom5.class);
            startActivity(i);
    	}
    	else if(position == 5){
            Intent i = getIntent();
            i = new Intent (this,Pom6.class);
            startActivity(i);
    	}
    	else if(position == 6){
            Intent i = getIntent();
            i = new Intent (this,Pom7.class);
            startActivity(i);
    	}
    	else if(position == 7){
            Intent i = getIntent();
            i = new Intent (this,Pom8.class);
            startActivity(i);
    	}
    	else if(position == 8){
            Intent i = getIntent();
            i = new Intent (this,Pom9.class);
            startActivity(i);
    	}
    	else if(position == 9){
            Intent i = getIntent();
            i = new Intent (this,Pom10.class);
            startActivity(i);
    	}
    	else if(position == 10){
            Intent i = getIntent();
            i = new Intent (this,Pom11.class);
            startActivity(i);
    	}
    	else if(position == 11){
            Intent i = getIntent();
            i = new Intent (this,Pom12.class);
            startActivity(i);
    	}
    	else if(position == 12){
            Intent i = getIntent();
            i = new Intent (this,Pom13.class);
            startActivity(i);
    	}
    	else if(position == 13){
            Intent i = getIntent();
            i = new Intent (this,Pom14.class);
            startActivity(i);
    	}
    	else if(position == 14){
            Intent i = getIntent();
            i = new Intent (this,Pom15.class);
            startActivity(i);
    	}
    	else if(position == 15){
            Intent i = getIntent();
            i = new Intent (this,Pom16.class);
            startActivity(i);
    	}
    	else if(position == 16){
            Intent i = getIntent();
            i = new Intent (this,Pom17.class);
            startActivity(i);
    	}
    	else if(position == 17){
            Intent i = getIntent();
            i = new Intent (this,Pom18.class);
            startActivity(i);
    	}
    	else if(position == 18){
            Intent i = getIntent();
            i = new Intent (this,Pom19.class);
            startActivity(i);
    	}
    	else if(position == 19){
            Intent i = getIntent();
            i = new Intent (this,Pom20.class);
            startActivity(i);
    	}
    	else if(position == 20){
            Intent i = getIntent();
            i = new Intent (this,Pom21.class);
            startActivity(i);
    	}
    	else if(position == 21){
            Intent i = getIntent();
            i = new Intent (this,Pom22.class);
            startActivity(i);
    	}
    	else if(position == 22){
            Intent i = getIntent();
            i = new Intent (this,Pom23.class);
            startActivity(i);
    	}
    	else if(position == 23){
            Intent i = getIntent();
            i = new Intent (this,Pom24.class);
            startActivity(i);
    	}
    	else if(position == 24){
            Intent i = getIntent();
            i = new Intent (this,Pom25.class);
            startActivity(i);
    	}
    	else if(position == 25){
            Intent i = getIntent();
            i = new Intent (this,Pom26.class);
            startActivity(i);
    	}
    	else if(position == 26){
            Intent i = getIntent();
            i = new Intent (this,Pom27.class);
            startActivity(i);
    	}
    	else if(position == 27){
            Intent i = getIntent();
            i = new Intent (this,Pom28.class);
            startActivity(i);
    	}
    	
    
}
}