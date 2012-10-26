package com.gna.backgammon;//kai omws tha valw to timer :P

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Intro extends Activity {
	Button Play;
	MediaPlayer intro;
	int i = 0 ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //full screen inc
        //must be below super.onCreate();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //full screen came !!
        setContentView(R.layout.activity_intro);
        intro =MediaPlayer.create(Intro.this, R.raw.intro);
        intro.start();
        Play = (Button) findViewById(R.id.butPlay);
        Play.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub

        		Intent openMenu = new Intent("com.gna.backgammon.MENU");
        		startActivity(openMenu);
			}
		});
        
	        	
        	
      
        
       
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_intro, menu);
        return true;
    }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		intro.release();
		finish();
	}
    
}
