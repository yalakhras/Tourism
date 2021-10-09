package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_p extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.first_p);
	        
	        Button b1=(Button) findViewById(R.id.button1_first);
	        b1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent jg=new Intent (First_p.this,Jordan_glance.class);
					startActivity(jg);
					
				}
			});
	        
	        Button b2=(Button) findViewById(R.id.button2_first);
	        b2.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent places=new Intent(First_p.this,Places.class);
					startActivity(places);
					
				}
			});
	        
	        
	        Button hotels=(Button) findViewById(R.id.button3_first_p);
	        hotels.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent ih=new Intent(First_p.this,Hotels.class);
					startActivity(ih);
					
				}
			});

	        
	        Button b4=(Button) findViewById(R.id.button4_first);
	        b4.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent tourist_offices=new Intent(First_p.this,Offices_amman.class);
					startActivity(tourist_offices);
					
				}
			});
	        
	        Button b5=(Button) findViewById(R.id.button5_first);
	        b5.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent al=new Intent(First_p.this,Airlines.class);
					startActivity(al);
				}
			});
	        
	        Button cus=(Button) findViewById(R.id.button6_first);
	        cus.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent c_us=new Intent(First_p.this,Contact_us1.class);
					startActivity(c_us);
					
				}
			});
	        

}
};
