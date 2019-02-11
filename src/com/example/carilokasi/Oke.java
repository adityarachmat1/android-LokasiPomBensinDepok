package com.example.carilokasi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class Oke extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listpom);
Button pom1=(Button)findViewById(R.id.pom1);
Button pom2=(Button)findViewById(R.id.pom2);
Button pom3=(Button)findViewById(R.id.pom3);
        
        pom1.setOnClickListener(new View.OnClickListener() {
            private MediaPlayer mpButtonClick;

			public void onClick(View v) {
            	

                // create an Intent to talk to Pom
                Intent myIntentPom1 = new Intent(Oke.this,Pom1.class);
                // call Pom and wait for result
                startActivity(myIntentPom1);
                mpButtonClick = MediaPlayer.create(Oke.this, R.raw.button_click);
                mpButtonClick.start();
        
                

            }

        });
        pom2.setOnClickListener(new View.OnClickListener() {
            private MediaPlayer mpButtonClick;

			public void onClick(View v) {
            	

                // create an Intent to talk to Pom
                Intent myIntentPom2 = new Intent(Oke.this,Pom2.class);
                // call Pom and wait for result
                startActivity(myIntentPom2);
                mpButtonClick = MediaPlayer.create(Oke.this, R.raw.button_click);
                mpButtonClick.start();
        
                

            }

        });
        pom3.setOnClickListener(new View.OnClickListener() {
            private MediaPlayer mpButtonClick;

			public void onClick(View v) {
            	

                // create an Intent to talk to Pom
                Intent myIntentPom3 = new Intent(Oke.this,Pom3.class);
                // call Pom and wait for result
                startActivity(myIntentPom3);
                mpButtonClick = MediaPlayer.create(Oke.this, R.raw.button_click);
                mpButtonClick.start();
        
                

            }

        });
        
}
   
}


