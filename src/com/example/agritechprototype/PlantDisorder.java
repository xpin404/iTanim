package com.example.agritechprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlantDisorder extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_plant_disorder);
	}

	public void viewblast(View v) {
		Intent i=new Intent(this,DisorderBlast.class);
		startActivity(i);
	}

	public void viewsheathblight(View v) {
		Intent i=new Intent(this,DisorderSheathBlight.class);
		startActivity(i);
	}

	public void viewbrownspot(View v) {
		Intent i=new Intent(this,DisorderBrownSpot.class);
		startActivity(i);
	}
	public void viewstemrot(View v) {
		Intent i=new Intent(this,DisorderStemRot.class);
		startActivity(i);
	}
	public void viewsheathrot(View v) {
		Intent i=new Intent(this,DisorderSheatRot.class);
		startActivity(i);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}
	
	

}
