package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_aqaba5 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_aqaba5);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_haq5);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.intercontinental.com/icresortaqaba"));
				startActivity(web1);
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_haq5);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232092222"));
				startActivity(phone1);
			}
		});
        
        
        
// hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_haq5);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kempinski.com/aqaba"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView7_haq5);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email2=new Intent(Hotels_aqaba5.this,Contact_us.class);
				email2.putExtra("kempinski", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_haq5);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232090888"));
				startActivity(phone2);
			}
		});
        
        
// hotel 3
        
        CheckedTextView t3=(CheckedTextView) findViewById(R.id.checkedTextView10_haq5);
        t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.moevenpick-aqaba.com"));
				startActivity(web3);
			}
		});
        
        final CheckedTextView e3=(CheckedTextView) findViewById(R.id.checkedTextView11_haq5);
        e3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email3=new Intent(Hotels_aqaba5.this,Contact_us.class);
				email3.putExtra("mövenpick", e3.getText().toString());
				startActivity(email3);
				
			}
		});
        
        
        CheckedTextView p3=(CheckedTextView) findViewById(R.id.checkedTextView12_haq5);
        p3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone3=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232034020"));
				startActivity(phone3);
			}
		});
        
        
// hotel 4
        
        CheckedTextView t4=(CheckedTextView) findViewById(R.id.checkedTextView14_haq5);
        t4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.moevenpick-hotels.com"));
				startActivity(web4);
			}
		});
        
        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView15_haq5);
        e4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email4=new Intent(Hotels_aqaba5.this,Contact_us.class);
				email4.putExtra("movenpick", e4.getText().toString());
				startActivity(email4);
				
			}
		});
        
        
        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView16_haq5);
        p4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232090300"));
				startActivity(phone4);
			}
		});
		
		
	}

}
