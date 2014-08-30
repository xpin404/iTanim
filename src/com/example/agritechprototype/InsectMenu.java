package com.example.agritechprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InsectMenu extends Activity {


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insect_menu);
	}

	public void viewinsectlangaw(View v) {
		Intent i=new Intent(this,InsectLangaw.class);
		startActivity(i);
	}

	public void viewmolecricket(View v) {
		Intent i=new Intent(this,InsectMoleCricket.class);
		startActivity(i);
}
	public void viewleaffolder(View v) {
		Intent i=new Intent(this,Leaffolder.class);
		startActivity(i);
	}
	public void viewcaseworm(View v) {
		Intent i=new Intent(this,InsectCaseworm.class);
		startActivity(i);
	}
	public void viewgrasshopper(View v) {
		Intent i=new Intent(this,InsectGrasshopper.class);
		startActivity(i);
	}
	public void viewarmyworm(View v) {
		Intent i=new Intent(this,InsectArmyworm.class);
		startActivity(i);
	}
	public void viewwhorlmaggot(View v) {
		Intent i=new Intent(this,InsectWhorlMaggot.class);
		startActivity(i);
	}
	public void viewyellowstemborer(View v) {
		Intent i=new Intent(this,InsectYellowStemBorer.class);
		startActivity(i);
	}
	public void viewwhitestemborer(View v) {
		Intent i=new Intent(this,InsectWhiteStemBorer.class);
		startActivity(i);
	}
	public void viewpinkstemborer(View v) {
		Intent i=new Intent(this,InsectPinkStemBorer.class);
		startActivity(i);
	}
	public void viewstripestemborer(View v) {
		Intent i=new Intent(this,InsectStripeStemBorer.class);
		startActivity(i);
	}
	public void viewbrownplanthopper(View v) {
		Intent i=new Intent(this,InsectBrownPlanthopper.class);
		startActivity(i);
	}
	public void viewwhitebackedplanthopper(View v) {
		Intent i=new Intent(this,InsectWhiteBackedPlanthopper.class);
		startActivity(i);
	}
	public void viewgreenleafhopper(View v) {
		Intent i=new Intent(this,InsectGreenLeafhopper.class);
		startActivity(i);
	}
	public void viewzigzagleafhopper(View v) {
		Intent i=new Intent(this,InsectZigzagLeafhopper.class);
		startActivity(i);
	}
	public void viewricebug(View v) {
		Intent i=new Intent(this,InsectRiceBug.class);
		startActivity(i);
	}
	public void viewblackbug(View v) {
		Intent i=new Intent(this,InsectBlackBug.class);
		startActivity(i);
	}
	public void viewgoldenapplesnail(View v) {
		Intent i=new Intent(this,InsectGoldenAppleSnail.class);
		startActivity(i);
	}
	public void viewearthworm(View v) {
		Intent i=new Intent(this,InsectEarthworm.class);
		startActivity(i);
	}
	public void viewrat(View v) {
		Intent i=new Intent(this,InsectRat.class);
		startActivity(i);
	}
	public void viewsparrow(View v) {
		Intent i=new Intent(this,InsectSparrow.class);
		startActivity(i);
	}
		
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
		this.finish();
	}
}