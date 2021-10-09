package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_amman3 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_amman3);
		
// hotel 1
		
				CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_ha3);
		        t1.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.toledohotel.jo"));
						startActivity(web1);
					}
				});
		        
		        
		        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_ha3);
		        p1.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264657777"));
						startActivity(phone1);
					}
				});
		        
		        
// hotel 2
		        
		        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_ha3);
		        t2.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.retajhotel.com"));
						startActivity(web2);
					}
				});
		        
		        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView7_ha3);
		        e2.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email2=new Intent(Hotels_amman3.this,Contact_us.class);
						email2.putExtra("retaj", e2.getText().toString());
						startActivity(email2);
						
					}
				});
		        
		        
		        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_ha3);
		        p2.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265516688"));
						startActivity(phone2);
					}
				});
		        
		        
// hotel 3
		        
		        CheckedTextView t3=(CheckedTextView) findViewById(R.id.checkedTextView10_ha3);
		        t3.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.kindihotel.com"));
						startActivity(web3);
					}
				});
		        
		        final CheckedTextView e3=(CheckedTextView) findViewById(R.id.checkedTextView11_ha3);
		        e3.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email3=new Intent(Hotels_amman3.this,Contact_us.class);
						email3.putExtra("kindi", e3.getText().toString());
						startActivity(email3);
						
					}
				});
		        
		        
		        CheckedTextView p3=(CheckedTextView) findViewById(R.id.checkedTextView12_ha3);
		        p3.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone3=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265510885"));
						startActivity(phone3);
					}
				});
		        
		        
// hotel 4
		        
		        CheckedTextView t4=(CheckedTextView) findViewById(R.id.checkedTextView14_ha3);
		        t4.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.althurayahotel.com"));
						startActivity(web4);
					}
				});
		        
		        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView15_ha3);
		        e4.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email4=new Intent(Hotels_amman3.this,Contact_us.class);
						email4.putExtra("al Thuraya", e4.getText().toString());
						startActivity(email4);
						
					}
				});
		        
		        
		        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView16_ha3);
		        p4.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0069265677228"));
						startActivity(phone4);
					}
				});
		        
		        
// hotel 5
		        
		        CheckedTextView t5=(CheckedTextView) findViewById(R.id.checkedTextView18_ha3);
		        t5.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.regionhotel.com.jo"));
						startActivity(web5);
					}
				});
		        
		        final CheckedTextView e5=(CheckedTextView) findViewById(R.id.checkedTextView19_ha3);
		        e5.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email5=new Intent(Hotels_amman3.this,Contact_us.class);
						email5.putExtra("region", e5.getText().toString());
						startActivity(email5);
						
					}
				});
		        
		        
		        CheckedTextView p5=(CheckedTextView) findViewById(R.id.checkedTextView20_ha3);
		        p5.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone5=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265200120"));
						startActivity(phone5);
					}
				});
		        
		        
		        
// hotel 6
		        
		        CheckedTextView t6=(CheckedTextView) findViewById(R.id.checkedTextView22_ha3);
		        t6.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web6=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ramahotel-jo.com"));
						startActivity(web6);
					}
				});
		        
		        final CheckedTextView e6=(CheckedTextView) findViewById(R.id.checkedTextView23_ha3);
		        e6.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email6=new Intent(Hotels_amman3.this,Contact_us.class);
						email6.putExtra("rama", e6.getText().toString());
						startActivity(email6);
						
					}
				});
		        
		        
		        CheckedTextView p6=(CheckedTextView) findViewById(R.id.checkedTextView24_ha3);
		        p6.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone6=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265816722"));
						startActivity(phone6);
					}
				});
		        
		        
		        
// hotel 7
		        
		        CheckedTextView t7=(CheckedTextView) findViewById(R.id.checkedTextView26_ha3);
		        t7.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web7=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.abjarhotel.com.jo"));
						startActivity(web7);
					}
				});
		        
		        final CheckedTextView e7=(CheckedTextView) findViewById(R.id.checkedTextView27_ha3);
		        e7.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email7=new Intent(Hotels_amman3.this,Contact_us.class);
						email7.putExtra("abjar", e7.getText().toString());
						startActivity(email7);
						
					}
				});
		        
		        
		        CheckedTextView p7=(CheckedTextView) findViewById(R.id.checkedTextView28_ha3);
		        p7.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone7=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264648883"));
						startActivity(phone7);
					}
				});
		        
		        
		        
// hotel 8
		        
		        CheckedTextView t8=(CheckedTextView) findViewById(R.id.checkedTextView30_ha3);
		        t8.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web8=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.theliwan.com"));
						startActivity(web8);
					}
				});
		        
		        final CheckedTextView e8=(CheckedTextView) findViewById(R.id.checkedTextView31_ha3);
		        e8.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email8=new Intent(Hotels_amman3.this,Contact_us.class);
						email8.putExtra("liwan", e8.getText().toString());
						startActivity(email8);
						
					}
				});
		        
		        
		        CheckedTextView p8=(CheckedTextView) findViewById(R.id.checkedTextView32_ha3);
		        p8.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone8=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265858125"));
						startActivity(phone8);
					}
				});
		        
		        
// hotel 9
		        
		        CheckedTextView t9=(CheckedTextView) findViewById(R.id.checkedTextView34_ha3);
		        t9.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web9=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amman-inn.com"));
						startActivity(web9);
					}
				});
		        
		        final CheckedTextView e9=(CheckedTextView) findViewById(R.id.checkedTextView35_ha3);
		        e9.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email9=new Intent(Hotels_amman3.this,Contact_us.class);
						email9.putExtra("amman Inn", e9.getText().toString());
						startActivity(email9);
						
					}
				});
		        
		        
		        CheckedTextView p9=(CheckedTextView) findViewById(R.id.checkedTextView36_ha3);
		        p9.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone9=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265819630"));
						startActivity(phone9);
					}
				});
		        
		        
// hotel 10
		        
		        CheckedTextView t10=(CheckedTextView) findViewById(R.id.checkedTextView38_ha3);
		        t10.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent web10=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ammanorchidhotel.com"));
						startActivity(web10);
					}
				});
		        
		        final CheckedTextView e10=(CheckedTextView) findViewById(R.id.checkedTextView39_ha3);
		        e10.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Intent email10=new Intent(Hotels_amman3.this,Contact_us.class);
						email10.putExtra("orchid", e10.getText().toString());
						startActivity(email10);
						
					}
				});
		        
		        
		        CheckedTextView p10=(CheckedTextView) findViewById(R.id.checkedTextView40_ha3);
		        p10.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent phone10=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265522111"));
						startActivity(phone10);
					}
				});
		
	}

}
