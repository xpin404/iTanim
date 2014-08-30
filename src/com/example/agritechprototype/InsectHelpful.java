package com.example.agritechprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InsectHelpful extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insect_helpful);
	}

	public void viewmirid(View v) {
		Intent i=new Intent(this,InsectMirid.class);
		startActivity(i);
	}
	public void viewgroundbeetle(View v) {
		Intent i=new Intent(this,InsectGroundBeatle.class);
		startActivity(i);
	}
	public void viewladybeetle(View v) {
		Intent i=new Intent(this,InsectLadyBeatle.class);
		startActivity(i);
	}
	public void viewdamselfly(View v) {
		Intent i=new Intent(this,InsectDamselfly.class);
		startActivity(i);
	}
	public void viewdragonfly(View v) {
		Intent i=new Intent(this,InsectDragonfly.class);
		startActivity(i);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
