package com.example.agritechprototype;

import android.app.Activity;
import android.os.Bundle;

public class InsectBrownPlanthopper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insect_brown_planthopper);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
