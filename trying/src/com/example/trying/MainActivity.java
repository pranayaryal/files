package com.example.trying;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
  public Spinner spinner=(Spinner)findViewById(R.id.spinnerStates);
  ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	        R.array.us_states, android.R.layout.simple_spinner_item);
	// Specify the layout to use when the list of choices appears
	
	// Apply the adapter to the spinner
	spinner.setAdapter(adapter);
     


    
}
