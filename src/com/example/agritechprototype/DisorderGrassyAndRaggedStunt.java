package com.example.agritechprototype;

import android.app.Activity;
import android.os.Bundle;

public class DisorderGrassyAndRaggedStunt extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disorder_grassy_and_ragged_stunt);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}
}
