package com.example.carilokasi;

import java.text.DecimalFormat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Lokasi extends FragmentActivity {
 final int RQS_GooglePlayServices = 1;
 private GoogleMap myMap;
private Object LatLng;
String mylatitude="";
String mylongitude="";
String mylocation="";



 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "LOKASI SPBU");
        setContentView(R.layout.lokasi);
  
        
        
            
        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map);
        myMap = mySupportMapFragment.getMap();
        
        //LatLng pom88 = new LatLng(-6.280752, 106.838974);
        //MarkerOptions markerpomdepok88 = new MarkerOptions();
		//markerpomdepok88.position(pom88);
        //markerpomdepok88.title("Posisi Anda");
        //markerpomdepok88.snippet("Jl Sawo Manila Pasar Minggu, Jakarta Selatan");
        //markerpomdepok88.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
        //myMap.addMarker(markerpomdepok88);
        
        
        LatLng pom500 = new LatLng(-6.2902671, 106.6866184);
        MarkerOptions markerpomdepok500 = new MarkerOptions();
		markerpomdepok500.position(pom500);
        markerpomdepok500.title("TEST");
        markerpomdepok500.snippet("Jl. Pramuka Kemayoran Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok500.icon(BitmapDescriptorFactory.fromResource(R.drawable.sf));
        myMap.addMarker(markerpomdepok500);
        
        LatLng pom33 = new LatLng(-6.1942182,106.8597013);
        MarkerOptions markerpomdepok33 = new MarkerOptions();
		markerpomdepok33.position(pom33);
        markerpomdepok33.title("SPBU 31.131.01");
        markerpomdepok33.snippet("Jl. Pramuka Kemayoran Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok33.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok33);
        
//        LatLng sf = new LatLng(-6.18531831, 106.82659686);
//        MarkerOptions sf1 = new MarkerOptions();
//		sf1.position(sf);
//        sf1.title("Smartfren Office and Galery BSD");
//        sf1.snippet("Jl. Pahlawan Seribu. CBD BSD Lot 12.A, Serpong Utara, Lengkong Gudang, Tangerang, Kota Tangerang Selatan, Banten 15326");
//        sf1.icon(BitmapDescriptorFactory.fromResource(R.drawable.sf));
//        myMap.addMarker(sf1);
        
        LatLng pom34 = new LatLng(-6.1967963,106.8718103);
        MarkerOptions markerpomdepok34 = new MarkerOptions();
		markerpomdepok34.position(pom34);
        markerpomdepok34.title("SPBU 34.131.01");
        markerpomdepok34.snippet("Jl. Ahmad Yani 114 A Utan kayu Jakarta Timur, DKI Jakarta, Indonesia");
        markerpomdepok34.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok34);
        
        LatLng pom32 = new LatLng(-6.2025807,106.8540023);
        MarkerOptions markerpomdepok32 = new MarkerOptions();
		markerpomdepok32.position(pom32);
        markerpomdepok32.title("SPBU 34.131.02");
        markerpomdepok32.snippet("Jl. Matraman Raya No.44 Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok32.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok32);
        
        LatLng pom13 = new LatLng(-6.2079872,106.8569923);
        MarkerOptions markerpomdepok13 = new MarkerOptions();
		markerpomdepok13.position(pom13);
        markerpomdepok13.title("SPBU 34.131.03");
        markerpomdepok13.snippet("Jl. Matraman Raya No. 84 Jakarta Timur, DKI Jakarta, Indonesia");
        markerpomdepok13.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok13);
        
        LatLng pom25 = new LatLng(-6.1933606,106.8882674);
        MarkerOptions markerpomdepok25 = new MarkerOptions();
		markerpomdepok25.position(pom25);
        markerpomdepok25.title("SPBU 34.132.06");
        markerpomdepok25.snippet(" Jl. Pemuda Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok25.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok25);
        
        LatLng pom27 = new LatLng(-6.1997778,106.8823058);
        MarkerOptions markerpomdepok27 = new MarkerOptions();
		markerpomdepok27.position(pom27);
        markerpomdepok27.title("SPBU 34.132.08");
        markerpomdepok27.snippet("Jl. Rawamangun Muka Raya Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok27.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok27);
        
        LatLng pom15 = new LatLng(-6.1917547,106.8746643);
        MarkerOptions markerpomdepok15 = new MarkerOptions();
		markerpomdepok15.position(pom15);
        markerpomdepok15.title("SPBU 34.132.09");
        markerpomdepok15.snippet("Jl. Pemuda 40-41 Rawamangun Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok15.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok15);
        
        LatLng pom16 = new LatLng(-6.2430057,106.8671343);
        MarkerOptions markerpomdepok16 = new MarkerOptions();
		markerpomdepok16.position(pom16);
        markerpomdepok16.title("SPBU 34.133.05");
        markerpomdepok16.snippet("Jl. Otista Raya No.64B Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok16.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok16);
        
        LatLng pom17 = new LatLng(-6.2136399,106.8911388);
        MarkerOptions markerpomdepok17 = new MarkerOptions();
		markerpomdepok17.position(pom17);
        markerpomdepok17.title("SPBU 34.133.06");
        markerpomdepok17.snippet("Jl. Jatinegara Timur No. 54 Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok17.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok17);
        
        LatLng pom18 = new LatLng(-6.2169225,106.8618233);
        MarkerOptions markerpomdepok18 = new MarkerOptions();
		markerpomdepok18.position(pom18);
        markerpomdepok18.title("SPBU 34.133.07");
        markerpomdepok18.snippet("Jl. Jatinegara Barat No. 83 Jakarta Timur, DKI Jakarta, Indonesia");
        markerpomdepok18.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok18);
        
        LatLng pom19 = new LatLng(-6.2176311,106.9218939);
        MarkerOptions markerpomdepok19 = new MarkerOptions();
		markerpomdepok19.position(pom19);
        markerpomdepok19.title("SPBU 34.134.07");
        markerpomdepok19.snippet("Jl. Raden Intan Buaran Duren Sawit Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok19.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok19);
        
        LatLng pom21 = new LatLng(-6.2175392,106.8890628);
        MarkerOptions markerpomdepok21 = new MarkerOptions();
		markerpomdepok21.position(pom21);
        markerpomdepok21.title("SPBU 34.134.10");
        markerpomdepok21.snippet("Jl. Raden intan II (Masjid An Nur) Jakarta Timur, DKI Jakarta, Indonesia");
        markerpomdepok21.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok21);
        
        LatLng pom5 = new LatLng(6.2266129,106.8783529);
        MarkerOptions markerpomdepok5 = new MarkerOptions();
		markerpomdepok5.position(pom5);
        markerpomdepok5.title("SPBU 34.134.14");
        markerpomdepok5.snippet("Jl. Basuki Rachmat Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok5.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok5);
        
        LatLng pom28 = new LatLng(-6.2697004,106.868819);
        MarkerOptions markerpomdepok28 = new MarkerOptions();
		markerpomdepok28.position(pom28);
        markerpomdepok28.title("SPBU 34.134.15");
        markerpomdepok28.snippet("Jl. R.S. Sukanto Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok28.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok28);
        
        LatLng pom1 = new LatLng(-6.2701044,106.866565);
        MarkerOptions markerpomdepok1 = new MarkerOptions();
		markerpomdepok1.position(pom1);
        markerpomdepok1.title("SPBU 34.134.16");
        markerpomdepok1.snippet("Jl. RS Soekamto No.26 Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok1.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok1);
        
        LatLng pom2 = new LatLng(-6.2298594,106.8738443);
        MarkerOptions markerpomdepok2 = new MarkerOptions();
		markerpomdepok2.position(pom2);
        markerpomdepok2.title("SPBU 34.134.17");
        markerpomdepok2.snippet("Jl. DI.Panjaitan Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok2.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok2);
        
        LatLng pom29 = new LatLng(-6.2391611,106.9396173);
        MarkerOptions markerpomdepok29 = new MarkerOptions();
		markerpomdepok29.position(pom29);
        markerpomdepok29.title("SPBU 34.134.18");
        markerpomdepok29.snippet("Jl. H. Naman No. 29 Pondok Kelapa Jakarta Timur, DKI Jakarta, Indonesia 13450");
        markerpomdepok29.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok29);
        
        LatLng pom30 = new LatLng(-6.2171117,106.9212603);
        MarkerOptions markerpomdepok30 = new MarkerOptions();
		markerpomdepok30.position(pom30);
        markerpomdepok30.title("SPBU 34.134.19");
        markerpomdepok30.snippet("Jl. Raden Intan Jakarta Timur, DKI Jakarta, Indonesia 13440");
        markerpomdepok30.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok30);
        
        LatLng pom3 = new LatLng(-6.2160914,106.896712);
        MarkerOptions markerpomdepok3 = new MarkerOptions();
		markerpomdepok3.position(pom3);
        markerpomdepok3.title("SPBU 34.134.20");
        markerpomdepok3.snippet("Jl. Raya Kalimalang Cipinang Bali Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok3.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok3);
        
        LatLng pom4 = new LatLng(-6.2823805,106.8530305);
        MarkerOptions markerpomdepok4 = new MarkerOptions();
		markerpomdepok4.position(pom4);
        markerpomdepok4.title("SPBU 34.135.02");
        markerpomdepok4.snippet("Jl. Condet Raya Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok4.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok4);
        
        LatLng pom23 = new LatLng(-6.2966401,106.8889789);
        MarkerOptions markerpomdepok23 = new MarkerOptions();
		markerpomdepok23.position(pom23);
        markerpomdepok23.title("SPBU 34.135.03");
        markerpomdepok23.snippet(" Jl. Taman Mini Pintu I Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok23.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok23);
        
        LatLng pom35 = new LatLng(-6.2901272,106.8833914);
        MarkerOptions markerpomdepok35 = new MarkerOptions();
		markerpomdepok35.position(pom35);
        markerpomdepok35.title("SPBU 34.135.04");
        markerpomdepok35.snippet("Jl. Raya Pondok Gede Pinang Ranti Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok35.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok35);
        
        LatLng pom8 = new LatLng(-6.2861441,106.853317);
        MarkerOptions markerpomdepok8 = new MarkerOptions();
		markerpomdepok8.position(pom8);
        markerpomdepok8.title("SPBU 34.135.05");
        markerpomdepok8.snippet("Jl. Kramat Jati No. 109-110 Jakarta Timur, DKI Jakarta, Indonesia");
        markerpomdepok8.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok8);
        
        LatLng pom50 = new LatLng(-6.252433,106.8624338);
        MarkerOptions markerpomdepok50 = new MarkerOptions();
		markerpomdepok50.position(pom50);
        markerpomdepok50.title("SPBU 34.136.02");
        markerpomdepok50.snippet("Jl. Dewi Sartika No. 184Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok50.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok50);
        
        LatLng pom9 = new LatLng(-6.2456638,106.8657248);
        MarkerOptions markerpomdepok9 = new MarkerOptions();
		markerpomdepok9.position(pom9);
        markerpomdepok9.title("SPBU 34.136.04");
        markerpomdepok9.snippet("Jl. Dewi Sartika No. 232 Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok9.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok9);
        
        LatLng pom24 = new LatLng(-6.3661465,106.8910677);
        MarkerOptions markerpomdepok24 = new MarkerOptions();
		markerpomdepok24.position(pom24);
        markerpomdepok24.title("SPBU 34.137.06");
        markerpomdepok24.snippet("Jl. Raya Jambore Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok24.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok24);
        
        LatLng pom12 = new LatLng(-6.3397254,106.8780331);
        MarkerOptions markerpomdepok12 = new MarkerOptions();
		markerpomdepok12.position(pom12);
        markerpomdepok12.title("SPBU 34.137.09");
        markerpomdepok12.snippet("Jl. Raya PKP Ciracas Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok12.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok12);
       
        LatLng pom11 = new LatLng(-6.3396335,106.8452021);
        MarkerOptions markerpomdepok11 = new MarkerOptions();
		markerpomdepok11.position(pom11);
        markerpomdepok11.title("SPBU 34.138.01");
        markerpomdepok11.snippet("Jl. TMII Pintu 2 Pomdok Gede Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok11.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok11);
        
        LatLng pom31 = new LatLng(-6.2861969,106.8730867);
        MarkerOptions markerpomdepok31 = new MarkerOptions();
		markerpomdepok31.position(pom31);
        markerpomdepok31.title("SPBU 34.138.02");
        markerpomdepok31.snippet("Jl. Raya Pondok Gede No.40 Jakarta Timur, DKI Jakarta, Indonesia ");
        markerpomdepok31.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok31);
        
       
        
        
       Button   btnterdekat=(Button)findViewById(R.id.btnterdekat);
       btnterdekat.setEnabled(false);
       btnterdekat.setOnClickListener(new View.OnClickListener() {
        		public void onClick(View arg0) {
        			Intent  i= new Intent(Lokasi.this, Maps_test.class);
        			mylocation="Posisi Asal";
        		     mylatitude=String.valueOf(myMap.getMyLocation().getLatitude());//String.valueOf(arg0.getPosition().latitude);
        		     mylongitude=String.valueOf(myMap.getMyLocation().getLongitude());//String.valueOf(arg0.getPosition().longitude);
        			i.putExtra("mylatitude", mylatitude);
        			i.putExtra("mylongitude", mylongitude);
        			i.putExtra("mylocation", mylocation);
	     			startActivity(i);
	     			finish();
        			
        }});  
       
       
        
        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
        myMap.getUiSettings().setCompassEnabled(true);
        
        myMap.getUiSettings().setZoomControlsEnabled(true);
        
        myMap.getUiSettings().setMyLocationButtonEnabled(true);
        
        myMap.setTrafficEnabled(true);
        
        myMap.setMyLocationEnabled(true);
       
        
        //myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(jakarta, 15));
        
        myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.2136399,106.8911388),11));
       
        myMap.setOnMarkerClickListener(new OnMarkerClickListener() {
   
   


private double earthRadius;

@Override
   public boolean onMarkerClick(Marker arg0) {
    // TODO Auto-generated method stub
	
    
    try {
     StringBuilder urlString = new StringBuilder();         
     String daddr = (String.valueOf(arg0.getPosition().latitude)+","+String.valueOf(arg0.getPosition().longitude)); 
     urlString.append("http://maps.google.com/maps?f=d&hl=en"); 
     urlString.append("&saddr="+String.valueOf(myMap.getMyLocation().getLatitude())+","+String.valueOf(myMap.getMyLocation().getLongitude())); 
     urlString.append("&daddr="+daddr);
     urlString.append("&radius=1000");
     urlString.append("&sensor=true");
     Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString.toString()));
    
     mylocation="Posisi Asal";
     mylatitude=String.valueOf(myMap.getMyLocation().getLatitude());//String.valueOf(arg0.getPosition().latitude);
     mylongitude=String.valueOf(myMap.getMyLocation().getLongitude());//String.valueOf(arg0.getPosition().longitude);
     
     Location locationA = new Location("point A");
     Location locationB = new Location("point B");
     locationA.setLatitude(myMap.getMyLocation().getLatitude());
     locationA.setLongitude(myMap.getMyLocation().getLongitude());
     locationB.setLatitude(arg0.getPosition().latitude);
     locationB.setLongitude(arg0.getPosition().longitude);
     DecimalFormat df = new DecimalFormat(".#");
     double distance = locationA.distanceTo(locationB);
     //Maka Jaraknya :
     Toast.makeText(getApplicationContext(),"Jarak Dari Lokasi Anda: " + Double.valueOf(df.format(distance/1000)) + " Km" , Toast.LENGTH_LONG).show();
     startActivity(i);
    } catch (Exception ee) {
     Toast.makeText(getApplicationContext(), "Lokasi Saat Ini Belum Didapatkan, Pastikan Internet Aktif", Toast.LENGTH_LONG).show();
    }
    return false;
   }




  });
      
        myMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
   
   @Override
   public void onInfoWindowClick(Marker arg0) {
    // TODO Auto-generated method stub
    //JIKA KLIKNYA INGIN DI INFO WINDOW
   }
        
  });
    }

    



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public Object getLatLng() {
		return LatLng;
	}

	public void setLatLng(Object latLng) {
		LatLng = latLng;
	}
	
		    } 
 

    

