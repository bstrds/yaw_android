package com.gna.backgammon;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Canvas ;

public class Game extends Activity {
	
	Button Roll;
	TextView first;
	TextView Dice1;
	TextView Dice2;
	boolean whiteFirst;
	boolean whiteTurn;
	byte wr,br;
	
	@Override
	protected void onCreate(Bundle Game) {
		// TODO Auto-generated method stub
		super.onCreate(Game);
		//full screen inc
        //must be below super.onCreate();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //full screen came !!
		
		
		
		setContentView(R.layout.game);
		
		Roll = (Button) findViewById(R.id.Roll);
		first= (TextView) findViewById(R.id.first);
		Dice1 = (TextView) findViewById(R.id.Dice1);
		Dice2 = (TextView) findViewById(R.id.Dice2);
		do { 
			wr = (byte)((Math.random()*6)+1);
			br = (byte)((Math.random()*6)+1);
			} while (wr==br);
			first(wr,br);
			if (whiteFirst) {
				whiteTurn=true;
			} else {
				whiteTurn=false;
			}
			
			
	Roll.setOnClickListener(new View.OnClickListener() {
		
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			roll();
			
		}
	});
	
	}
		
	
	
	public void first(byte wr, byte br) {
		
			if(wr>br) {
				first.setText("White: "+wr+", Black: "+br+". White plays first.");
				whiteFirst = true;
			} else if(wr<br){
				first.setText("Black:"+br+",White:"+wr+". Black plays first");
				whiteFirst = false;
			}
	}
	
	public void roll() {
		byte dice1 = (byte)((Math.random()*6)+1);
		byte dice2 = (byte)((Math.random()*6)+1);
		Dice1.setText(""+dice1);
		Dice2.setText(""+dice2);
		first.setText("");
		
	    //movegen(dice1, dice2);
	}
	

}
