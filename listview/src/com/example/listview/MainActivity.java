package com.example.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;


public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] contacts = {"tall","short","long"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_main, contacts);
		setListAdapter(adapter);
        
    }


}
