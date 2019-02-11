package com.example.carilokasi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class SQLHelper extends SQLiteOpenHelper{

 private static final String DATABASE_NAME = "db.db";
 private static final int DATABASE_VERSION = 1;

 public SQLHelper(Context context) {
  super(context, DATABASE_NAME, null, DATABASE_VERSION);
  // TODO Auto-generated constructor stub
 }


 @Override
 public void onCreate(SQLiteDatabase db) {
  String sql = "create table kota( id integer primary key autoincrement, nama text null, " +
    "latitude text null, longitude text null);";
  Log.d("Data", "onCreate: " + sql);
  db.execSQL(sql);
  sql = "INSERT INTO kota (id, nama, latitude, longitude) VALUES (1, 'SPBU 31.164.01', '111', '222');";
  db.execSQL(sql);
  sql = "INSERT INTO kota (id, nama, latitude, longitude) VALUES (2, 'Surakarta', '333', '444');";
  db.execSQL(sql);
  
 }

 @Override
 public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)                           {
  // TODO Auto-generated method stub
  
 }

}
