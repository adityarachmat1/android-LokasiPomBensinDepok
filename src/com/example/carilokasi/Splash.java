package com.example.carilokasi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Splash extends Activity{
	
	MediaPlayer AudiBackground;
	
	private static final int SPLASH_TIME = 2 * 1000;// Set waktu 5 Detik
	ProgressBar prg;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);//layout yang diload
		
		 //Memanggil file my_sound pada folder raw
		 AudiBackground = MediaPlayer.create(this, R.raw.backsound);
		       
		 //Set volume audio agar berbunyi
		        AudiBackground.setVolume(1,1);
		        //Memulai audio
		        AudiBackground.start();
		
		prg = (ProgressBar)findViewById(R.id.progressBar1);//Tampilan progress Bar
		prg.setAlpha(SPLASH_TIME);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent intent = new Intent(Splash.this,MainActivity.class);
				startActivity(intent);
				finish();
				
			}
		}, SPLASH_TIME);
		
		new Handler().postDelayed(new Runnable() {
			  @Override
			  public void run() {
			         } 
			    }, SPLASH_TIME);
	}
}
