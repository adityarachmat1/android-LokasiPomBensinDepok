package com.example.carilokasi;


import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.ListActivity;
import android.content.Intent;

public class Activity_list extends Activity {
ListView lv;
ArrayAdapter<String> adapter;
EditText inputSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "LIST SPBU DEPOK");
        setContentView(R.layout.activity_list);
        
        String [] spbu = new String [] { "SPBU 34.164.04", "SPBU 34.164.06", "SPBU 34.164.07", "SPBU 34.164.10", "SPBU 34.164.11", "SPBU 34.164.12", "SPBU 34.164.13",  
        		"SPBU 34.164.14", "SPBU 34.164.15", "SPBU 34.164.16", "SPBU 34.169.17", "SPBU 34.165.03", "SPBU 34.165.05", "SPBU 34.165.09", "SPBU 34.165.10", 
        		"SPBU 34.165.11", "SPBU 34.165.12", "SPBU 34.164.17", "SPBU 34.169.06", "SPBU 34.169.09",  "SPBU 34.169.10", "SPBU 34.169.15", "SPBU 34.169.20", "SPBU 34.169.24", 
        		"SPBU 34.164.32"};
        
        adapter = new ArrayAdapter<String>(this, R.layout.list1,
                R.id.SPBU, spbu);
    lv = (ListView) findViewById (R.id.listView1);
    inputSearch = (EditText) findViewById(R.id.inputSearch);
    lv.setAdapter (adapter);
    
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

              @Override
              public void onItemClick(AdapterView<?> arg0, View arg1, int posisi,
                           long arg3) {
                     int item = posisi;
                     String itemText = (String) lv.getItemAtPosition(posisi);
                     Toast.makeText(getBaseContext(), "" + itemText, Toast.LENGTH_LONG).show();
// ketika salah satu item list di klik maka akan membuka activity lain dan akan menampilkan toast jadwal + sesuai nama item list yang di klik.
  
   
       if(itemText.equals("SPBU 34.164.04")){
              Intent i = getIntent();
              i = new Intent (Activity_list.this,Menu1 .class);
              startActivity(i);
       }
       else if (itemText.equals("SPBU 34.164.06")){
           Intent i = getIntent();
           i = new Intent (Activity_list.this, Menu2.class);
           startActivity (i);
    }
       else if (itemText.equals("SPBU 34.164.07")){
           Intent i = getIntent();
           i = new Intent (Activity_list.this, Menu3.class);
           startActivity (i);
    }
       else if (itemText.equals("SPBU 34.164.10")){
           Intent i =getIntent();
           i = new Intent (Activity_list.this, Pom1.class);
           startActivity(i);
    }
       else if (itemText.equals("SPBU 34.164.11")){
           Intent i = getIntent();
           i = new Intent (Activity_list.this, Pom2.class);
           startActivity(i);
    }
       else if (itemText.equals("SPBU 34.164.12")){
           Intent i = getIntent();
           i = new Intent (Activity_list.this, Pom3.class);
           startActivity(i);
       }
           else if (itemText.equals("SPBU 34.164.13")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Menu2.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.164.14")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Menu3.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.164.15")){
               Intent i =getIntent();
               i = new Intent (Activity_list.this, Pom1.class);
               startActivity(i);
        }
           else if (itemText.equals("SPBU 34.164.16")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom2.class);
               startActivity(i);
        }
           else if (itemText.equals("SPBU 34.169.17")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom3.class);
               startActivity(i);
           }
           else if (itemText.equals("SPBU 34.165.03")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom1.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.165.05")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom2.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.165.09")){
               Intent i =getIntent();
               i = new Intent (Activity_list.this, Pom1.class);
               startActivity(i);
        }
           else if (itemText.equals("SPBU 34.165.10")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom3.class);
               startActivity(i);
        }
           else if (itemText.equals("SPBU 34.165.11")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom3.class);
               startActivity(i);
           }
           else if (itemText.equals("SPBU 34.165.12")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom3.class);
               startActivity(i);
           }
           else if (itemText.equals("SPBU 34.165.17")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Menu2.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.169.06")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Menu3.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.169.09")){
               Intent i =getIntent();
               i = new Intent (Activity_list.this, Pom1.class);
               startActivity(i);
        }
           else if (itemText.equals("SPBU 34.169.10")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom2.class);
               startActivity(i);
        }
           else if (itemText.equals("SPBU 34.169.15")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Pom3.class);
               startActivity(i);
           }
           else if (itemText.equals("SPBU 34.169.20")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Menu2.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.169.24")){
               Intent i = getIntent();
               i = new Intent (Activity_list.this, Menu3.class);
               startActivity (i);
        }
           else if (itemText.equals("SPBU 34.169.32")){
               Intent i =getIntent();
               i = new Intent (Activity_list.this, Pom1.class);
               startActivity(i);
        }
       
          
              }
    });
    inputSearch.addTextChangedListener(new TextWatcher() {
        @Override
        public void onTextChanged(CharSequence cs, int arg1, int arg2,
            int arg3) {
          Activity_list.this.adapter.getFilter().filter(cs);
        }
        @Override
        public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                int arg3) {
            // TODO Auto-generated method stub
             
        }
        @Override
        public void afterTextChanged(Editable arg0) {
            // TODO Auto-generated method stub                          
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