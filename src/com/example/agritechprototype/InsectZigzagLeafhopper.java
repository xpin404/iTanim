package com.example.agritechprototype;

import android.app.Activity;
import android.os.Bundle;

public class InsectZigzagLeafhopper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insect_zigzag_leafhopper);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
