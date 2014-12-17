package com.example.pushmeclickme;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


public class AsyncTaskActivity extends Activity implements OnClickListener{
    
	Button buttonPush;
	ProgressBar progressBar;
	
	int nClick=0;
	int nPush=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        progressBar.setProgress(0);
        
        buttonPush=(Button)findViewById(R.id.pushButton);
        
        buttonPush.setOnClickListener(this);
        
        
    }
        
    public void onClick(View v){
        	 new LongOperation().execute();
        	 buttonPush.setClickable(false);
        		
        	
        	}
        	
        	
    
private class LongOperation extends AsyncTask<Void,Integer,Void>{
    	int myProgress;
    	@Override
        protected Void doInBackground(Void... params) {
    		while(myProgress<100){
    		    myProgress++;
    		    publishProgress(myProgress);
    		    SystemClock.sleep(100);
    		   }
    		   return null;
            }
            
        

        @Override
        protected void onPostExecute(Void result) {
        	Toast.makeText(AsyncTaskActivity.this,
        	         "onPostExecute", Toast.LENGTH_SHORT).show();
        	buttonPush.setClickable(true);
        	
        }

        @Override
        protected void onPreExecute() {
        	Toast.makeText(AsyncTaskActivity.this,
        	         "onPretExecute", Toast.LENGTH_SHORT).show();
        	myProgress =0;
        	
        }

        protected void onProgressUpdate(int... values) {
        	progressBar.setProgress(values[0]);
        }
    }

    	
}

    		    
        	
        
   
        
    
        
        
        
        
        
    
	
	     
	



    

