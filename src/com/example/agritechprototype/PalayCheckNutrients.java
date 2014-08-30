package com.example.agritechprototype;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PalayCheckNutrients extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_palay_check_nutrients);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}
}
