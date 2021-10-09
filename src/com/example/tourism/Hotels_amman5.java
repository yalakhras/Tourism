package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_amman5 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_amman5);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_hotels_amman5);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.leroyalamman.com"));
				startActivity(web1);
			}
		});
        
        final CheckedTextView e1=(CheckedTextView) findViewById(R.id.checkedTextView3_hotels_amman5);
        e1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email1=new Intent(Hotels_amman5.this,Contact_us.class);
				email1.putExtra("royal", e1.getText().toString());
				startActivity(email1);
				
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_hotels_amman5);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264603000"));
				startActivity(phone1);
			}
		});
        
        
// hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_hotels_amman5);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.sheratonammanalnabil.com"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView7_hotels_amman5);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email2=new Intent(Hotels_amman5.this,Contact_us.class);
				email2.putExtra("sheraton", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_hotels_amman5);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265934111"));
				startActivity(phone2);
			}
		});
        
        
// hotel 3
        
        CheckedTextView t3=(CheckedTextView) findViewById(R.id.checkedTextView10_hotels_amman5);
        t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amman.holiday-inn.com"));
				startActivity(web3);
			}
		});
        
        final CheckedTextView e3=(CheckedTextView) findViewById(R.id.checkedTextView11_hotels_amman5);
        e3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email3=new Intent(Hotels_amman5.this,Contact_us.class);
				email3.putExtra("holiday", e3.getText().toString());
				startActivity(email3);
				
			}
		});
        
        
        CheckedTextView p3=(CheckedTextView) findViewById(R.id.checkedTextView12_hotels_amman5);
        p3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone3=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265528822"));
				startActivity(phone3);
			}
		});
        
        
// hotel 4
        
        CheckedTextView t4=(CheckedTextView) findViewById(R.id.checkedTextView14_hotels_amman5);
        t4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.fourseasons.com"));
				startActivity(web4);
			}
		});
        
        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView15_hotels_amman5);
        e4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email4=new Intent(Hotels_amman5.this,Contact_us.class);
				email4.putExtra("four Seasons", e4.getText().toString());
				startActivity(email4);
				
			}
		});
        
        
        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView16_hotels_amman5);
        p4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 096265505555"));
				startActivity(phone4);
			}
		});
        
        
// hotel 5
        
        CheckedTextView t5=(CheckedTextView) findViewById(R.id.checkedTextView18_hotels_amman5);
        t5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.crowneplaza.com"));
				startActivity(web5);
			}
		});
        
        final CheckedTextView e5=(CheckedTextView) findViewById(R.id.checkedTextView19_hotels_amman5);
        e5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email5=new Intent(Hotels_amman5.this,Contact_us.class);
				email5.putExtra("plaza", e5.getText().toString());
				startActivity(email5);
				
			}
		});
        
        
        CheckedTextView p5=(CheckedTextView) findViewById(R.id.checkedTextView20_hotels_amman5);
        p5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone5=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265510001"));
				startActivity(phone5);
			}
		});
        
        
        
// hotel 6
        
        CheckedTextView t6=(CheckedTextView) findViewById(R.id.checkedTextView22_hotels_amman5);
        t6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web6=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.theregencyhotel.com"));
				startActivity(web6);
			}
		});
        
        final CheckedTextView e6=(CheckedTextView) findViewById(R.id.checkedTextView23_hotels_amman5);
        e6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email6=new Intent(Hotels_amman5.this,Contact_us.class);
				email6.putExtra("regency", e6.getText().toString());
				startActivity(email6);
				
			}
		});
        
        
        CheckedTextView p6=(CheckedTextView) findViewById(R.id.checkedTextView24_hotels_amman5);
        p6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone6=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265607000"));
				startActivity(phone6);
			}
		});
        
        
        
// hotel 7
        
        CheckedTextView t7=(CheckedTextView) findViewById(R.id.checkedTextView26_hotels_amman5);
        t7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web7=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amman.hyatt.com"));
				startActivity(web7);
			}
		});
        
        final CheckedTextView e7=(CheckedTextView) findViewById(R.id.checkedTextView27_hotels_amman5);
        e7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email7=new Intent(Hotels_amman5.this,Contact_us.class);
				email7.putExtra("hyatt", e7.getText().toString());
				startActivity(email7);
				
			}
		});
        
        
        CheckedTextView p7=(CheckedTextView) findViewById(R.id.checkedTextView28_hotels_amman5);
        p7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone7=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264651234"));
				startActivity(phone7);
			}
		});
        
        
        
// hotel 8
        
        CheckedTextView t8=(CheckedTextView) findViewById(R.id.checkedTextView30_hotels_amman5);
        t8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web8=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.landmarkamman.com"));
				startActivity(web8);
			}
		});
        
        final CheckedTextView e8=(CheckedTextView) findViewById(R.id.checkedTextView31_hotels_amman5);
        e8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email8=new Intent(Hotels_amman5.this,Contact_us.class);
				email8.putExtra("landmark", e8.getText().toString());
				startActivity(email8);
				
			}
		});
        
        
        CheckedTextView p8=(CheckedTextView) findViewById(R.id.checkedTextView32_hotels_amman5);
        p8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone8=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265607100"));
				startActivity(phone8);
			}
		});
        
        
// hotel 9
        
        CheckedTextView t9=(CheckedTextView) findViewById(R.id.checkedTextView34_hotels_amman5);
        t9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web9=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.lemeridienamman.com"));
				startActivity(web9);
			}
		});
        
        
        CheckedTextView p9=(CheckedTextView) findViewById(R.id.checkedTextView35_hotels_amman5);
        p9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone9=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265696511"));
				startActivity(phone9);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
