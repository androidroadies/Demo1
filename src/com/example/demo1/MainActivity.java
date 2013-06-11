package com.example.demo1;

import java.net.URI;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener
{

	Button skype,fb;
	ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		skype=(Button) findViewById(R.id.btnskype);
		skype.setOnClickListener(this);
		

		fb=(Button) findViewById(R.id.btnfb);
		fb.setOnClickListener(this);
		
	}
	protected boolean isAppInstalled(String packageName) {
        Intent mIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (mIntent != null) {
        	
        	System.out.println("success");
        	startActivity(mIntent);
            return true;
        }
        else {
        	System.out.println("success false");
        	String url = "https://play.google.com/store/apps/details?id=com.skype.raider&feature=nav_result#?t=W251bGwsMSwxLDMsImNvbS5za3lwZS5yYWlkZXIiXQ..";
        	Intent i = new Intent(Intent.ACTION_VIEW);
        	i.setData(Uri.parse(url));
        	startActivity(i);
            return false;
        }
    }
	protected boolean isAppInstalledFB(String packageName) {
        Intent mIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (mIntent != null) {
        	
        	System.out.println("success");
        	startActivity(mIntent);
            return true;
        }
        else {
        	System.out.println("success false");
        	String url = "https://play.google.com/store/apps/details?id=com.facebook.katana&feature=search_result#?t=W251bGwsMSwxLDEsImNvbS5mYWNlYm9vay5rYXRhbmEiXQ..";
        	Intent i = new Intent(Intent.ACTION_VIEW);
        	i.setData(Uri.parse(url));
        	startActivity(i);
            return false;
        }
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.equals(skype)) 
		{
			isAppInstalled("com.skype.raider");
		}
		else if (v.equals(fb)) 
		{
			isAppInstalledFB("com.facebook.katana");
		}
	}
}
