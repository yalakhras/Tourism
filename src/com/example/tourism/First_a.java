package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_a extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.first_a);
	        
	        Button b1=(Button) findViewById (R.id.button1_first_a);
	        b1.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i3=new Intent (First_a.this,Jordan_glance_a.class);
					startActivity(i3);
					
				}
			});
	        
	        Button b2=(Button) findViewById(R.id.button2_first_a);
	        b2.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i4=new Intent(First_a.this,Places_a.class);
					startActivity(i4);
					
				}
			});
	        
	        Button b3=(Button) findViewById(R.id.button3_first_a);
	        b3.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i5=new Intent(First_a.this,Hotels.class);
					startActivity(i5);
				}
			});
	        
	        
	        
	        Button b4=(Button) findViewById(R.id.button4_first_a);
	        b4.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i6=new Intent(First_a.this,Offices_amman.class);
					startActivity(i6);
					
				}
			});
	        
	        Button b5=(Button) findViewById(R.id.button5_first_a);
	        b5.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i7=new Intent(First_a.this,Airlines.class);
					startActivity(i7);
					
				}
			});
	        
	        Button b6=(Button) findViewById(R.id.button6_first_a);
	        b6.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i8=new Intent(First_a.this,Contact_us1.class);
					startActivity(i8);
					
				}
			});

}
};
