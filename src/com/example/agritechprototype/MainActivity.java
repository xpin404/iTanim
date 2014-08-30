package com.example.agritechprototype;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void viewreference(View v) {
		Intent i=new Intent(this,Reference.class);
		startActivity(i);
	}
	public void viewinsectmenu(View v) {
		Intent i=new Intent(this,InsectMenu.class);
		startActivity(i);
	}
	public void viewhelpful(View v) {
		Intent i=new Intent(this,InsectHelpful.class);
		startActivity(i);
	}
	
	public void viewdisorder(View v) {
		Intent i=new Intent(this,PlantDisorder.class);
		startActivity(i);
	}

	public void viewlcc(View v) {
		Intent i=new Intent(this,LCCMenu.class);
		startActivity(i);
	}
	public void viewpalaycheck(View v) {
		Intent i=new Intent(this,PalayCheck.class);
		startActivity(i);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

	
}