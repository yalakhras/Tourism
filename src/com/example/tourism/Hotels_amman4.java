package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_amman4 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_amman4);
		
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_ha4);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ammanwesthotel.com"));
				startActivity(web1);
			}
		});
        
        final CheckedTextView e1=(CheckedTextView) findViewById(R.id.checkedTextView3_ha4);
        e1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email1=new Intent(Hotels_amman4.this,Contact_us.class);
				email1.putExtra("west", e1.getText().toString());
				startActivity(email1);
				
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_ha4);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264657615"));
				startActivity(phone1);
			}
		});
        
        
//hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_ha4);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jerusalem.com.jo"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView7_ha4);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email2=new Intent(Hotels_amman4.this,Contact_us.class);
				email2.putExtra("jerusalem", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_ha4);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265151121"));
				startActivity(phone2);
			}
		});
        
        
//hotel 3
        
        CheckedTextView t3=(CheckedTextView) findViewById(R.id.checkedTextView10_ha4);
        t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.atico-jo.com"));
				startActivity(web3);
			}
		});
        
        final CheckedTextView e3=(CheckedTextView) findViewById(R.id.checkedTextView11_ha4);
        e3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email3=new Intent(Hotels_amman4.this,Contact_us.class);
				email3.putExtra("qasr", e3.getText().toString());
				startActivity(email3);
				
			}
		});
        
        
        CheckedTextView p3=(CheckedTextView) findViewById(R.id.checkedTextView12_ha4);
        p3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone3=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265666140"));
				startActivity(phone3);
			}
		});
        
        
//hotel 4
        
        CheckedTextView t4=(CheckedTextView) findViewById(R.id.checkedTextView14_ha4);
        t4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ammanchamhotel.com"));
				startActivity(web4);
			}
		});
        
        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView15_ha4);
        e4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email4=new Intent(Hotels_amman4.this,Contact_us.class);
				email4.putExtra("cham", e4.getText().toString());
				startActivity(email4);
				
			}
		});
        
        
        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView16_ha4);
        p4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265659270"));
				startActivity(phone4);
			}
		});
        
        
//hotel 5
        
        CheckedTextView t5=(CheckedTextView) findViewById(R.id.checkedTextView18_ha4);
        t5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.danaplazahotel.com"));
				startActivity(web5);
			}
		});
        
        final CheckedTextView e5=(CheckedTextView) findViewById(R.id.checkedTextView19_ha4);
        e5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email5=new Intent(Hotels_amman4.this,Contact_us.class);
				email5.putExtra("dana", e5.getText().toString());
				startActivity(email5);
				
			}
		});
        
        
        CheckedTextView p5=(CheckedTextView) findViewById(R.id.checkedTextView20_ha4);
        p5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone5=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265924455"));
				startActivity(phone5);
			}
		});
        
        
        
//hotel 6
        
        CheckedTextView t6=(CheckedTextView) findViewById(R.id.checkedTextView22_ha4);
        t6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web6=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ammangrandpalace.com"));
				startActivity(web6);
			}
		});
        
        final CheckedTextView e6=(CheckedTextView) findViewById(R.id.checkedTextView23_ha4);
        e6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email6=new Intent(Hotels_amman4.this,Contact_us.class);
				email6.putExtra("grand", e6.getText().toString());
				startActivity(email6);
				
			}
		});
        
        
        CheckedTextView p6=(CheckedTextView) findViewById(R.id.checkedTextView24_ha4);
        p6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone6=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265691131"));
				startActivity(phone6);
			}
		});
        
        
        
//hotel 7
        
        CheckedTextView t7=(CheckedTextView) findViewById(R.id.checkedTextView26_ha4);
        t7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web7=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.imperialpalace.com"));
				startActivity(web7);
			}
		});
        
        final CheckedTextView e7=(CheckedTextView) findViewById(R.id.checkedTextView27_ha4);
        e7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email7=new Intent(Hotels_amman4.this,Contact_us.class);
				email7.putExtra("imperial", e7.getText().toString());
				startActivity(email7);
				
			}
		});
        
        
        CheckedTextView p7=(CheckedTextView) findViewById(R.id.checkedTextView28_ha4);
        p7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone7=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265651333"));
				startActivity(phone7);
			}
		});
        
        
        
//hotel 8
        
        CheckedTextView t8=(CheckedTextView) findViewById(R.id.checkedTextView30_ha4);
        t8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web8=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.goldentulipairportamman.com"));
				startActivity(web8);
			}
		});
        
        final CheckedTextView e8=(CheckedTextView) findViewById(R.id.checkedTextView31_ha4);
        e8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email8=new Intent(Hotels_amman4.this,Contact_us.class);
				email8.putExtra("golden", e8.getText().toString());
				startActivity(email8);
				
			}
		});
        
        
        CheckedTextView p8=(CheckedTextView) findViewById(R.id.checkedTextView32_ha4);
        p8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone8=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264451000"));
				startActivity(phone8);
			}
		});
        
        
//hotel 9
        
        CheckedTextView t9=(CheckedTextView) findViewById(R.id.checkedTextView34_ha4);
        t9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web9=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.qualitysuitesamman.com"));
				startActivity(web9);
			}
		});
        
        final CheckedTextView e9=(CheckedTextView) findViewById(R.id.checkedTextView35_ha4);
        e9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email9=new Intent(Hotels_amman4.this,Contact_us.class);
				email9.putExtra("quality", e9.getText().toString());
				startActivity(email9);
				
			}
		});
        
        
        CheckedTextView p9=(CheckedTextView) findViewById(R.id.checkedTextView36_ha4);
        p9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone9=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265502550"));
				startActivity(phone9);
			}
		});
        
        
//hotel 10
        
        CheckedTextView t10=(CheckedTextView) findViewById(R.id.checkedTextView38_ha4);
        t10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web10=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.zamzamtowershotel.com"));
				startActivity(web10);
			}
		});
        
        final CheckedTextView e10=(CheckedTextView) findViewById(R.id.checkedTextView39_ha4);
        e10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email10=new Intent(Hotels_amman4.this,Contact_us.class);
				email10.putExtra("zamzam", e10.getText().toString());
				startActivity(email10);
				
			}
		});
        
        
        CheckedTextView p10=(CheckedTextView) findViewById(R.id.checkedTextView40_ha4);
        p10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone10=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265332000"));
				startActivity(phone10);
			}
		});
	}

}
