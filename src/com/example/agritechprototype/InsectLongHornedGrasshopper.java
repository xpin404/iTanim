package com.example.agritechprototype;

import android.app.Activity;
import android.os.Bundle;

public class InsectLongHornedGrasshopper extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insect_long_horned_grasshopper);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
