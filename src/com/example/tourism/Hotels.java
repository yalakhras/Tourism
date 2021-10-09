package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Hotels extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels);
		
		TabHost tabHost=(TabHost)findViewById(R.id.tabhost);
		tabHost.setup();
		
		TabSpec spec1=tabHost.newTabSpec("");
		spec1.setContent(R.id.tab1);
//		spec1.setIndicator("5 stars");
		spec1.setIndicator("",getResources().getDrawable(R.drawable.starrating5));

		TabSpec spec2=tabHost.newTabSpec("");
		spec2.setContent(R.id.tab2);
//		spec2.setIndicator("4 stars");
		spec2.setIndicator("",getResources().getDrawable(R.drawable.starrating4));

		TabSpec spec3=tabHost.newTabSpec("");
		spec3.setContent(R.id.tab3);
//        spec3.setIndicator("3 stars");
		spec3.setIndicator("",getResources().getDrawable(R.drawable.starrating3));
		

		tabHost.addTab(spec1);
		tabHost.addTab(spec2);
		tabHost.addTab(spec3);
		
		
		Button b1_t1=(Button) findViewById(R.id.button1_tab1);
		b1_t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a1=new Intent(Hotels.this,Hotels_amman5.class);
				startActivity(a1);
				
			}
		});
		
		Button b2_t1=(Button) findViewById(R.id.button2_tab1);
		b2_t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a2=new Intent(Hotels.this,Hotels_deadsea5.class);
				startActivity(a2);
				
			}
		});
		
		Button b3_t1=(Button) findViewById(R.id.button3_tab1);
		b3_t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a3=new Intent(Hotels.this,Hotels_petra5.class);
				startActivity(a3);
				
			}
		});
		
		Button b4_t1=(Button) findViewById(R.id.button4_tab1);
		b4_t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent a4=new Intent(Hotels.this,Hotels_aqaba5.class);
				startActivity(a4);
				
			}
		});
		
				
		
		Button b1_t2=(Button) findViewById(R.id.button1_tab2);
		b1_t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b1=new Intent(Hotels.this,Hotels_amman4.class);
				startActivity(b1);
				
			}
		});
		
		Button b2_t2=(Button)findViewById(R.id.button2_tab2);
		b2_t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent b2=new Intent(Hotels.this,Hotels_deadsea4.class);
				startActivity(b2);
			}
		});
		
		Button b3_t2=(Button) findViewById(R.id.button3_tab2);
		b3_t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent b3=new Intent(Hotels.this,Hotels_aqaba4.class);
				startActivity(b3);
			}
		});
		
		
		Button b1_t3=(Button) findViewById(R.id.button1_tab3);
		b1_t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent c1=new Intent(Hotels.this,Hotels_amman3.class);
				startActivity(c1);
				
			}
		});
		
		Button b2_t3=(Button) findViewById(R.id.button2_tab3);
		b2_t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent c2=new Intent(Hotels.this,Hotels_petra3.class);
				startActivity(c2);
			}
		});
		
		Button b3_t3=(Button) findViewById(R.id.button3_tab3);
		b3_t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent c3=new Intent(Hotels.this,Hotels_aqaba3.class);
				startActivity(c3);
			}
		});
		

	}
}