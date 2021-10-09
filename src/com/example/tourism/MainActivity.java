package com.example.tourism;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.CheckedTextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        CheckedTextView e1=(CheckedTextView) findViewById(R.id.main_english);
        e1.setOnClickListener(new View.OnClickListener() {
        	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(MainActivity.this,First_p.class);
				startActivity(i1);
				
			}
		});
        
        CheckedTextView a1=(CheckedTextView) findViewById(R.id.main_arabic);
        a1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2=new Intent(MainActivity.this,First_a.class);
				startActivity(i2);
				
			}
		});
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
