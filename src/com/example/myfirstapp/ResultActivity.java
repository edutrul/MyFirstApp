package com.example.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

public class ResultActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.result_activity);
		
		int result = getIntent().getIntExtra(MainActivity.MESSAGE_WAS_RESULT, 0);
		Log.v("ResulActivity", "" + result);
		
		FragmentManager fragmentManager = getSupportFragmentManager();
		Fragment fragment = fragmentManager.findFragmentById(R.id.container);
		
		if (fragment == null) {
			FragmentTransaction fragmentTransaction =  fragmentManager.beginTransaction();
			if (result == MainActivity.WAS_INCREDIBLE) {
				fragmentTransaction.add(R.id.container, new WasCoolFragment());
			}
			else if (result == MainActivity.WAS_AWFUL) {
				fragmentTransaction.add(R.id.container, new WasAwfulFragment());
			}
			fragmentTransaction.commit();
		}
	}
}
