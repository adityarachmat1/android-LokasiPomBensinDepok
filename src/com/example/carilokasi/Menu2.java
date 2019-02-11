package com.example.carilokasi;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class Menu2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn3=(Button)findViewById(R.id.btn3);
        
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // create an Intent to talk to Menu2
                Intent myIntentMenu1 = new Intent(Menu2.this,Menu1.class);
                // call Menu2 and wait for result
                startActivity(myIntentMenu1);

                

            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // create an Intent to talk to Menu3
                Intent myIntentMenu3 = new Intent(Menu2.this,Menu3.class);
                // call Menu3 and wait for result
                startActivity(myIntentMenu3);

                

            }

        });
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}


