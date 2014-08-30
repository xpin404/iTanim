package com.example.agritechprototype;

import android.app.Activity;
import android.os.Bundle;

public class DisorderBacterialLeafBlight extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_disorder_bacterial_leaf_blight);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
