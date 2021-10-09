package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_deadsea5 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_deadsea5);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_hd5);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.crowneplaza.com/deadseajordan"));
				startActivity(web1);
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_hd5);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096253494000"));
				startActivity(phone1);
			}
		});
        
        
        
// hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_hd5);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.holidayinnresorts.com/deadsea"));
				startActivity(web2);
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_hd5);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096253495555"));
				startActivity(phone2);
			}
		});
        
        
// hotel 3
        
        CheckedTextView t3=(CheckedTextView) findViewById(R.id.checkedTextView10_hd5);
        t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.marriottdeadsea.com"));
				startActivity(web3);
			}
		});
        
        
// hotel 4
        
        CheckedTextView t4=(CheckedTextView) findViewById(R.id.checkedTextView14_hd5);
        t4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kempinski.com/deadsea"));
				startActivity(web4);
			}
		});
        
        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView15_hd5);
        e4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email4=new Intent(Hotels_deadsea5.this,Contact_us.class);
				email4.putExtra("kempinski", e4.getText().toString());
				startActivity(email4);
				
			}
		});
        
        
        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView16_hd5);
        p4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096253568888"));
				startActivity(phone4);
			}
		});
        
        
// hotel 5
        
        CheckedTextView t5=(CheckedTextView) findViewById(R.id.checkedTextView18_hd5);
        t5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.moevenpick-deadsea.com"));
				startActivity(web5);
			}
		});
        
        final CheckedTextView e5=(CheckedTextView) findViewById(R.id.checkedTextView19_hd5);
        e5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email5=new Intent(Hotels_deadsea5.this,Contact_us.class);
				email5.putExtra("movenpick", e5.getText().toString());
				startActivity(email5);
				
			}
		});
        
        
        CheckedTextView p5=(CheckedTextView) findViewById(R.id.checkedTextView20_hd5);
        p5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone5=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096253561111"));
				startActivity(phone5);
			}
		});
		
		
	}

}
