package com.example.carilokasi;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class Menu3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // create an Intent to talk to Menu1
                Intent myIntentMenu1 = new Intent(Menu3.this,Menu1.class);
                // call Menu1 and wait for result
                startActivity(myIntentMenu1);

                

            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // create an Intent to talk to Menu2
                Intent myIntentMenu2 = new Intent(Menu3.this,Menu2.class);
                // call Menu3 and wait for result
                startActivity(myIntentMenu2);

                

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

