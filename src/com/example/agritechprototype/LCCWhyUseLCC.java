package com.example.agritechprototype;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LCCWhyUseLCC extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lccwhy_use_lcc);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
