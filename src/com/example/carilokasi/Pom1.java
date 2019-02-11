package com.example.carilokasi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Pom1 extends FragmentActivity {
	 final int RQS_GooglePlayServices = 1;
	 private GoogleMap myMap;
	private Object LatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Detail SPBU");
        setContentView(R.layout.pom1);
        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map1);
        myMap = mySupportMapFragment.getMap();
        
        LatLng pom1 = new LatLng(-6.374242, 106.832728);
        MarkerOptions markerpomdepok1 = new MarkerOptions();
		markerpomdepok1.position(pom1);
        markerpomdepok1.title("SPBU 31.164.01");
        markerpomdepok1.snippet("Jl. Margonda Raya,Beji,Kota Depok, Jawa Barat 16424, Indonesia");
        markerpomdepok1.icon(BitmapDescriptorFactory.fromResource(R.drawable.dua));
        myMap.addMarker(markerpomdepok1);
        
        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
        myMap.getUiSettings().setCompassEnabled(true);
        
        myMap.getUiSettings().setZoomControlsEnabled(true);
        
        myMap.getUiSettings().setMyLocationButtonEnabled(true);
        
        myMap.setMyLocationEnabled(true);
        
        //myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(jakarta, 15));
        
        myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-6.374242, 106.832728),12));
		
        
        myMap.setOnMarkerClickListener(new OnMarkerClickListener() {
   
   @Override
   public boolean onMarkerClick(Marker arg0) {
    // TODO Auto-generated method stub
    
    try {
     StringBuilder urlString = new StringBuilder();         
     String daddr = (String.valueOf(arg0.getPosition().latitude)+","+String.valueOf(arg0.getPosition().longitude)); 
     urlString.append("http://maps.google.com/maps?f=d&hl=en"); 
     urlString.append("&saddr="+String.valueOf(myMap.getMyLocation().getLatitude())+","+String.valueOf(myMap.getMyLocation().getLongitude())); 
     urlString.append("&daddr="+daddr);
     Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(urlString.toString()));
     startActivity(i);
    } catch (Exception ee) {
     Toast.makeText(getApplicationContext(), "Lokasi Saat Ini Belum Didapatkan, Coba Nyalakan GPS, Keluar Ruangan dan Tunggu Beberapa Saat", Toast.LENGTH_LONG).show();
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

        
        
           

