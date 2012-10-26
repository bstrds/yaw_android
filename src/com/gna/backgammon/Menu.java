package com.gna.backgammon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Menu extends Activity implements View.OnClickListener{
	Button bPlay1v1 ,bPlayVsPc,bTrollTheDice,bAbout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//full screen inc
        //must be below super.onCreate();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //full screen came !!
		setContentView(R.layout.menu);
		
		setButtons();//a method to set the buttons
		bPlay1v1.setOnClickListener(this);
		bAbout.setOnClickListener(this);
		
		
	}

	private void setButtons() {
		bPlay1v1 = (Button) findViewById(R.id.bPlay1v1);
		bPlayVsPc = (Button) findViewById(R.id.bPlayVsPc);
		bTrollTheDice = (Button) findViewById(R.id.bTrollTheDice);
		bAbout = (Button) findViewById(R.id.bAbout);
		
	}
	public void onClick(View v){
		switch(v.getId()){
		case R.id.bPlay1v1:
			Intent openPlay1v1 = new Intent("com.gna.backgammon.GAME");
			startActivity(openPlay1v1);
			break;
		case R.id.bAbout:
			Intent openAbout = new Intent("com.gna.backgammon.ABOUT");
			startActivity(openAbout);
			break;
		}
	}

}
