package com.example.carilokasi;

import java.io.IOException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;



 public class MainActivity extends Activity {
		 
MediaPlayer mpButtonClick;
MediaPlayer mp;

boolean status;
ImageView imvSuara;

	        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "MENU UTAMA");
        setContentView(R.layout.activity_main);
        
        mpButtonClick = MediaPlayer.create(this, R.raw.button_click);
        playlagu();
        Button button3=(Button)findViewById(R.id.BTN7);
        Button button4=(Button)findViewById(R.id.BTN8);
        Button button5=(Button)findViewById(R.id.BTN9);
        Button button1=(Button)findViewById(R.id.BTN6);
        Button button2=(Button)findViewById(R.id.Godftr);
        
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	

                // create an Intent to talk to Pom
                Intent myIntentTest = new Intent(MainActivity.this,Test.class);
                // call Pom and wait for result
                startActivity(myIntentTest);
                mpButtonClick = MediaPlayer.create(MainActivity.this, R.raw.button_click);
                mpButtonClick.start();
        
                

            }

        });
        
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // create an Intent to talk to Lay1
                Intent myIntentLay1 = new Intent(MainActivity.this,Lay1.class);
                // call Lay1 and wait for result
                startActivity(myIntentLay1);
                mpButtonClick = MediaPlayer.create(MainActivity.this, R.raw.button_click);
                mpButtonClick.start();
                

            }

        });
    
    
    		button4.setOnClickListener(new View.OnClickListener() {
    		public void onClick(View v) {

    			// create an Intent to talk to Utama
    			Intent myIntentUtama = new Intent(MainActivity.this,Utama.class);
    			// call Utama and wait for result
    			startActivity(myIntentUtama);
    			 mpButtonClick = MediaPlayer.create(MainActivity.this, R.raw.button_click);
    			mpButtonClick.start();
            

        }

    });
    		
    		button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    // create an Intent to talk to About
                    Intent myIntentAbout = new Intent(MainActivity.this,About.class);
                    // call About and wait for result
                    startActivity(myIntentAbout);
                    mpButtonClick = MediaPlayer.create(MainActivity.this, R.raw.button_click);
                    mpButtonClick.start();
                    

                }

            });
    		
    	 
  	     
  	      
    		button1.setOnClickListener(new View.OnClickListener() {
        		public void onClick(View v) {

        			// create an Intent to talk to Lokasi
        			Intent myIntentLokasi = new Intent(MainActivity.this,Lokasi.class);
        			// call List and wait for result
        			startActivity(myIntentLokasi);
        			 mpButtonClick = MediaPlayer.create(MainActivity.this, R.raw.button_click);
        			mpButtonClick.start();
        		}
    		
    		 });
    		
//    		button1.setOnClickListener(new View.OnClickListener() {
//        		public void onClick(View v) {
//
//        			// create an Intent to talk to Lokasi
//        			
//        			Intent myIntentLokasi = new Intent(MainActivity.this,Maps_test.class);
//        			// call List and wait for result
//        			startActivity(myIntentLokasi);
//        			 mpButtonClick = MediaPlayer.create(MainActivity.this, R.raw.button_click);
//        			mpButtonClick.start();
//        		}
//    		
//    		 });
    		imvSuara=(ImageView)findViewById(R.id.imageView88);	
            imvSuara.setOnClickListener(new View.OnClickListener() {
          

			public void onClick(View arg0) {

            	if(status == true){
            		imvSuara.setImageResource(R.drawable.play);
            		imvSuara.getLayoutParams().width = 80;				
            		imvSuara.getLayoutParams().height = 80;				
            		
            	        
            		playlagu();
            		Toast.makeText(getApplicationContext(), "Musik diaktifkan", Toast.LENGTH_SHORT).show();
            	}
            	else {
            		imvSuara.setImageResource(R.drawable.stop);
            		imvSuara.getLayoutParams().width = 80;				
            		imvSuara.getLayoutParams().height = 80;				

            		stopLagu();
            		Toast.makeText(getApplicationContext(), "Musik dinonaktifkan", Toast.LENGTH_SHORT).show();
            		}
            	
            }});
    }


    public void playlagu(){
     //memainkan mediaPlayer yang berada di folder raw 
     mp = MediaPlayer.create(MainActivity.this, R.raw.rude);
     try{
      mp.prepare();
     } catch (IllegalStateException e){
      e.printStackTrace();
      
     } catch (IOException e){
      e.printStackTrace();
      
     }
     mp.start();
     
     status = false;
     
    }
     //membuat aksi stop

    public void stopLagu(){
     mp.stop();
    status = true;
    }
    
 


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
        
        @Override
    	
   	 //Jika Tekan Tombol back
   	 public void onBackPressed() {
   	   exit();//Pergi ke method exit 
   	 }
   	 private void exit() {
   	  AlertDialog.Builder builder = new AlertDialog.Builder(this);
   	  builder.setMessage("Are You Sure Want to Exit?")
   	  .setCancelable(false)//tidak bisa tekan tombol back
   	  //jika pilih yess
   	  .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
   	   public void onClick(DialogInterface dialog, int id) {
   	    finish();
   	 stopLagu();
   	   }
   	  })
   	  //jika pilih no
   	  .setNegativeButton("No", new DialogInterface.OnClickListener() {
   	   public void onClick(DialogInterface dialog, int id) {
   	    dialog.cancel();
   	   }
   	  }).show();

    }
    
}