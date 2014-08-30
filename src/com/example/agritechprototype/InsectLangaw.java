package com.example.agritechprototype;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class InsectLangaw extends Activity {

Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insect_langaw);
		b=(Button) findViewById(R.id.button1);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}
	


}
