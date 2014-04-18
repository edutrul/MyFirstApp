package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	public static final int WAS_INCREDIBLE = 1;
	public static final int WAS_AWFUL = 0;
	
	public static final String MESSAGE_WAS_RESULT = "com.example.myfirstapp.MainActivity.MESSAGE_WAS_RESULT";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
	}
	
	public void clickWasIncredible(View view) {
		Toast.makeText(getApplicationContext(), "Click on Was Incredible", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(getApplicationContext(), ResultActivity.class).putExtra(MESSAGE_WAS_RESULT, WAS_INCREDIBLE));
	}
	
	public void clickWasAwful(View view) {
		Toast.makeText(getApplicationContext(), "Click on Was Awful!", Toast.LENGTH_SHORT).show();
		startActivity(new Intent(getApplicationContext(), ResultActivity.class).putExtra(MESSAGE_WAS_RESULT, WAS_AWFUL));
	}
	
}
