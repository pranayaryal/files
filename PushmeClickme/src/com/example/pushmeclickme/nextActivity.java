package com.example.pushmeclickme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class nextActivity extends Activity{
     public void onCreate(Bundle savedInstanceState){
    	 super.onCreate(savedInstanceState);
    	 setContentView(R.layout.nextactivity);
    	 Button b1=(Button)findViewById(R.id.button1);
    	 b1.setOnClickListener(new OnClickListener(){
    		 public void onClick(View v){
    		    Intent intent=new Intent(nextActivity.this,AsyncTaskActivity.class);
    	       startActivity(intent);
    	 }
     });
    	 
    	
     
}
}
