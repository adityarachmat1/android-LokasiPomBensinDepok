package com.example.carilokasi;

import java.text.DecimalFormat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LokasiTerdekat extends FragmentActivity {
 final int RQS_GooglePlayServices = 1;
 private GoogleMap myMap;
private Object LatLng;
private Button butoon1;


 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "LOKASI TERDEKAT");
        setContentView(R.layout.terdekat);
        butoon1 = (Button) findViewById(R.id.btn_dekat);
        butoon1.setVisibility(View.GONE);

        Intent io = this.getIntent();
        String mylatitude=io.getStringExtra("mylatitude");
        String mylongitude=io.getStringExtra("mylongitude");
        String mylocation=io.getStringExtra("mylocation");
        
        double lat1=-6.374242;
        double lon1=106.832728;
        try{
        	
        	lat1=Double.parseDouble(mylatitude);
        	lon1=Double.parseDouble(mylongitude);
        }
        catch(Exception ee){}
            
        FragmentManager myFragmentManager = getSupportFragmentManager();
        SupportMapFragment mySupportMapFragment = (SupportMapFragment)myFragmentManager.findFragmentById(R.id.map1);
        myMap = mySupportMapFragment.getMap();
        
        
        
        double lat2=-6.296776;
        double lon2=106.67041;
        double jmin=50;
        
//        lat2=-6.18531831;
//        lon2=106.8265968;
        
        
        LatLng sf = new LatLng(lat2, lon2);
        MarkerOptions sf1 = new MarkerOptions();
		sf1.position(sf);
        sf1.title("Smartfren Office and Galery BSD");
        sf1.snippet("Jl. Pahlawan Seribu. CBD BSD Lot 12.A, Serpong Utara, Lengkong Gudang, Tangerang, Kota Tangerang Selatan, Banten 15326");
        sf1.icon(BitmapDescriptorFactory.fromResource(R.drawable.sf));
        
        CircleOptions circleOptions = new CircleOptions()
        .center(sf)
        .radius(200)
        .strokeWidth(2)
        .strokeColor(Color.RED)
        .fillColor(Color.BLUE);
        // Supported formats are: #RRGGBB #AARRGGBB
        //   #AA is the alpha, or amount of transparency

        myMap.addCircle(circleOptions);
        myMap.addMarker(sf1);
        if(hitungJarak(lat1,lon1,lat2,lon2)<=jmin){
        butoon1.setVisibility(View.VISIBLE);
        }else{
        	butoon1.setVisibility(View.GONE);
        }
        
        
        
        
       
        
        
        myMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
        myMap.getUiSettings().setCompassEnabled(true);
        
        myMap.getUiSettings().setZoomControlsEnabled(true);
        
        myMap.getUiSettings().setMyLocationButtonEnabled(true);
        
        myMap.setTrafficEnabled(true);
        
        myMap.setMyLocationEnabled(true);
       
        
        //myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(jakarta, 15));
        
        myMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat2, lon2),9));
       
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

    

    private double hitungJarak(double lat2, double lon2) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
         if (keyCode == KeyEvent.KEYCODE_BACK) {
        	 Intent  i= new Intent(LokasiTerdekat.this, Lokasi.class);
  			startActivity(i);
  			finish();
         return true;
         }
         return super.onKeyDown(keyCode, event);    
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
	 public static double hitungJarak(double lat1, double lng1, double lat2, double lng2) {
		    double earthRadius = 3958.75;
		    double dLat = Math.toRadians(lat2-lat1);
		    double dLng = Math.toRadians(lng2-lng1);
		    double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
		               Math.sin(dLng/2) * Math.sin(dLng/2);
		    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		    double dist = earthRadius * c;

		    int meterConversion = 1609;
		    double myjr=dist * meterConversion;
		    return Math.floor(myjr/1);
		    } 
 
}
    

