package com.example.agritechprototype;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread splash_screen = new Thread(){
			public void run(){
				try{
					sleep(5000);
					startActivity(new Intent(getApplicationContext(),MainActivity.class));
				}catch(InterruptedException e){
					e.printStackTrace();
				}
					
					finish();
				}
			
		};
		splash_screen.start();
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
