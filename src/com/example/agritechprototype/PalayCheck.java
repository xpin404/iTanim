package com.example.agritechprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PalayCheck extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_palay_check);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

	public void viewpalaycheckseed(View v) {
		Intent i=new Intent(this,PalayCheckSeed.class);
		startActivity(i);
	}

	public void viewpalaycheckland(View v) {
		Intent i=new Intent(this,PalayCheckLand.class);
		startActivity(i);
	}

	public void viewpalaycheckcrop(View v) {
		Intent i=new Intent(this,PalayCheckCrop.class);
		startActivity(i);
	}
}
