package com.example.agritechprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LCCMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lccmenu);
	}


	public void viewhowtouse(View v) {
		Intent i=new Intent(this,LCCHowToUse.class);
		startActivity(i);
	}

	public void viewwhyuselcc(View v) {
		Intent i=new Intent(this,LCCWhyUseLCC.class);
		startActivity(i);
	}

	public void viewwhentotake(View v) {
		Intent i=new Intent(this,LCCWhenToTake.class);
		startActivity(i);
	}

	public void viewcriticalvaluetoapply(View v) {
		Intent i=new Intent(this,LCCCriticalValueToApply.class);
		startActivity(i);
	}

	public void viewlcclcc(View v) {
		Intent i=new Intent(this,LCCLCC.class);
		startActivity(i);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}

}
