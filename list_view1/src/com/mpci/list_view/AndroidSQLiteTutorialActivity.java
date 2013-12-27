package com.mpci.list_view;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * This activity is used to add, get and delete data from database and show data in listView
 * 
 * @authors Hovik & Roza
 */

public class AndroidSQLiteTutorialActivity extends Activity {
	public ListView listView; 
	public static ArrayList<String> ArrayofName = new ArrayList<String>();
		Button mADD; 
		Button mDELET;
		DatabaseHandler db = new DatabaseHandler(this);
	/* 
	 * Called when the activity is first created. 
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		mADD = (Button) findViewById(R.id.btnAdd);
		mDELET = (Button)findViewById(R.id.btnDelet);
		mADD.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				addContactsList();
			}
		});
		mDELET.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				delete();
				}
		});
	}	

	/*
	 *  Insert and get data from database
	 */
	public void addContactsList(){
	Log.d("Insert: ", "Inserting ..");
	db.addContact(new Contact("Hovik", "30",
			R.drawable.ic_launcher));
	db.addContact(new Contact("Serine", "21",
			R.drawable.ic_launcher));
	db.addContact(new Contact("Lilit", "20",
			R.drawable.ic_launcher));
	db.addContact(new Contact("Artush", "22",
			R.drawable.ic_launcher));
	db.addContact(new Contact("Artak", "24",
			R.drawable.ic_launcher));
	
	db.getAllContacts();
	/*
	 * Add data in listView
	 */
	listView = (ListView) findViewById(R.id.View1);

	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_list_item_1, ArrayofName);

	listView.setAdapter(adapter);

	}
	public void delete()
	{
	DatabaseHandler database = new DatabaseHandler(this);
	try {
	    database.deleteContact("Hov");
	} catch (NullPointerException e) {
	    Log.d("DATABASE", "ERROR!");
	    e.printStackTrace();
	}
	}
	}

