package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Offices_amman extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.offices_amman);
		
		
//office 1		
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_office_amman);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.akdmc.com"));
				startActivity(web1);
			}
		});
        
        final CheckedTextView e1=(CheckedTextView) findViewById(R.id.checkedTextView3_office_amman);
        e1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email1=new Intent(Offices_amman.this,Contact_us.class);
				email1.putExtra("abercrombie", e1.getText().toString());
				startActivity(email1);
				
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_office_amman);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265665465"));
				startActivity(phone1);
			}
		});
		
		
        
// office 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_office_amman);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.adamtraveljordan.net"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView7_office_amman);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email2=new Intent(Offices_amman.this,Contact_us.class);
				email2.putExtra("adam", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_office_amman);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265353062"));
				startActivity(phone2);
			}
		});
        
        
// office 3
        
        CheckedTextView t3=(CheckedTextView) findViewById(R.id.checkedTextView10_office_amman);
        t3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.adonistravel.com/jordan"));
				startActivity(web3);
			}
		});
        
        final CheckedTextView e3=(CheckedTextView) findViewById(R.id.checkedTextView11_office_amman);
        e3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email3=new Intent(Offices_amman.this,Contact_us.class);
				email3.putExtra("adonis", e3.getText().toString());
				startActivity(email3);
				
			}
		});
        
        
        CheckedTextView p3=(CheckedTextView) findViewById(R.id.checkedTextView12_office_amman);
        p3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone3=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265627875"));
				startActivity(phone3);
			}
		});
        
        
// office 4
        
        CheckedTextView t4=(CheckedTextView) findViewById(R.id.checkedTextView14_office_amman);
        t4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.advisertours.com"));
				startActivity(web4);
			}
		});
        
        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView15_office_amman);
        e4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email4=new Intent(Offices_amman.this,Contact_us.class);
				email4.putExtra("adviser", e4.getText().toString());
				startActivity(email4);
				
			}
		});
        
        
        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView16_office_amman);
        p4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265538325"));
				startActivity(phone4);
			}
		});
        

        
// office 5
        
        CheckedTextView t5=(CheckedTextView) findViewById(R.id.checkedTextView18_office_amman);
        t5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.aliatours.com.jo"));
				startActivity(web5);
			}
		});
        
        final CheckedTextView e5=(CheckedTextView) findViewById(R.id.checkedTextView19_office_amman);
        e5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email5=new Intent(Offices_amman.this,Contact_us.class);
				email5.putExtra("alali", e5.getText().toString());
				startActivity(email5);
				
			}
		});
        
        
        CheckedTextView p5=(CheckedTextView) findViewById(R.id.checkedTextView20_office_amman);
        p5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone5=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265829494"));
				startActivity(phone5);
			}
		});
        
        
// office 6
        
        CheckedTextView t6=(CheckedTextView) findViewById(R.id.checkedTextView22_office_amman);
        t6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web6=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.alathar-tours.com"));
				startActivity(web6);
			}
		});
        
        final CheckedTextView e6=(CheckedTextView) findViewById(R.id.checkedTextView23_office_amman);
        e6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email6=new Intent(Offices_amman.this,Contact_us.class);
				email6.putExtra("alathar", e6.getText().toString());
				startActivity(email6);
				
			}
		});
        
        
        CheckedTextView p6=(CheckedTextView) findViewById(R.id.checkedTextView24_office_amman);
        p6.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone6=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265562766"));
				startActivity(phone6);
			}
		});
        
        
// office 7
        
        CheckedTextView t7=(CheckedTextView) findViewById(R.id.checkedTextView26_office_amman);
        t7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web7=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.alhanitravel.com"));
				startActivity(web7);
			}
		});
        
        final CheckedTextView e7=(CheckedTextView) findViewById(R.id.checkedTextView27_office_amman);
        e7.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email7=new Intent(Offices_amman.this,Contact_us.class);
				email7.putExtra("alhani", e7.getText().toString());
				startActivity(email7);
				
			}
		});
        
        
// office 8
        
        CheckedTextView t8=(CheckedTextView) findViewById(R.id.checkedTextView30_office_amman);
        t8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web8=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.aljazeerahtravel.com/home.html"));
				startActivity(web8);
			}
		});
        
        final CheckedTextView e8=(CheckedTextView) findViewById(R.id.checkedTextView31_office_amman);
        e8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email8=new Intent(Offices_amman.this,Contact_us.class);
				email8.putExtra("aljazeerah", e8.getText().toString());
				startActivity(email8);
				
			}
		});
        
        
        CheckedTextView p8=(CheckedTextView) findViewById(R.id.checkedTextView32_office_amman);
        p8.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone8=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265633233"));
				startActivity(phone8);
			}
		});
        
        
// office 9
        
        CheckedTextView t9=(CheckedTextView) findViewById(R.id.checkedTextView34_office_amman);
        t9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web9=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.aladdintours.com"));
				startActivity(web9);
			}
		});
        
        final CheckedTextView e9=(CheckedTextView) findViewById(R.id.checkedTextView35_office_amman);
        e9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email9=new Intent(Offices_amman.this,Contact_us.class);
				email9.putExtra("aladdin", e9.getText().toString());
				startActivity(email9);
				
			}
		});
        
        
        CheckedTextView p9=(CheckedTextView) findViewById(R.id.checkedTextView36_office_amman);
        p9.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone9=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264641144"));
				startActivity(phone9);
			}
		});
        
        
        
// office 10
        
        CheckedTextView t10=(CheckedTextView) findViewById(R.id.checkedTextView38_office_amman);
        t10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web10=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amanitours.com"));
				startActivity(web10);
			}
		});
        
        final CheckedTextView e10=(CheckedTextView) findViewById(R.id.checkedTextView39_office_amman);
        e10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email10=new Intent(Offices_amman.this,Contact_us.class);
				email10.putExtra("amani", e10.getText().toString());
				startActivity(email10);
				
			}
		});
        
        
        CheckedTextView p10=(CheckedTextView) findViewById(R.id.checkedTextView40_office_amman);
        p10.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone10=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264636166"));
				startActivity(phone10);
			}
		});
        
        
// office 11
        
        CheckedTextView t11=(CheckedTextView) findViewById(R.id.checkedTextView42_office_amman);
        t11.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web11=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.ashtartours.com"));
				startActivity(web11);
			}
		});
        
        final CheckedTextView e11=(CheckedTextView) findViewById(R.id.checkedTextView43_office_amman);
        e11.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email11=new Intent(Offices_amman.this,Contact_us.class);
				email11.putExtra("ashtar", e11.getText().toString());
				startActivity(email11);
				
			}
		});
        
        
        CheckedTextView p11=(CheckedTextView) findViewById(R.id.checkedTextView44_office_amman);
        p11.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone11=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265865454"));
				startActivity(phone11);
			}
		});
        
// office 12
        
        CheckedTextView t12=(CheckedTextView) findViewById(R.id.checkedTextView46_office_amman);
        t12.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web12=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.cameratours.com.jo"));
				startActivity(web12);
			}
		});
        
        final CheckedTextView e12=(CheckedTextView) findViewById(R.id.checkedTextView47_office_amman);
        e12.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email12=new Intent(Offices_amman.this,Contact_us.class);
				email12.putExtra("camera", e12.getText().toString());
				startActivity(email12);
				
			}
		});
        
        
        CheckedTextView p12=(CheckedTextView) findViewById(R.id.checkedTextView48_office_amman);
        p12.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone12=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264616007"));
				startActivity(phone12);
			}
		});
        
        
// office 13
        
        CheckedTextView t13=(CheckedTextView) findViewById(R.id.checkedTextView50_office_amman);
        t13.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web13=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.creative-tour.com"));
				startActivity(web13);
			}
		});
        
        final CheckedTextView e13=(CheckedTextView) findViewById(R.id.checkedTextView51_office_amman);
        e13.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email13=new Intent(Offices_amman.this,Contact_us.class);
				email13.putExtra("creative", e13.getText().toString());
				startActivity(email13);
				
			}
		});
        
        
        CheckedTextView p13=(CheckedTextView) findViewById(R.id.checkedTextView52_office_amman);
        p13.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone13=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265550555"));
				startActivity(phone13);
			}
		});
        
        
// office 14
        
        CheckedTextView t14=(CheckedTextView) findViewById(R.id.checkedTextView54_office_amman);
        t14.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web14=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.dahlan.com"));
				startActivity(web14);
			}
		});
        
        final CheckedTextView e14=(CheckedTextView) findViewById(R.id.checkedTextView55_office_amman);
        e14.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email14=new Intent(Offices_amman.this,Contact_us.class);
				email14.putExtra("dahlan", e14.getText().toString());
				startActivity(email14);
				
			}
		});
        
        
        CheckedTextView p14=(CheckedTextView) findViewById(R.id.checkedTextView56_office_amman);
        p14.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone14=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265627366"));
				startActivity(phone14);
			}
		});
        
        
        
// office 15
        
        CheckedTextView t15=(CheckedTextView) findViewById(R.id.checkedTextView58_office_amman);
        t15.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web15=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.dakkak.com"));
				startActivity(web15);
			}
		});
        
        final CheckedTextView e15=(CheckedTextView) findViewById(R.id.checkedTextView59_office_amman);
        e15.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email15=new Intent(Offices_amman.this,Contact_us.class);
				email15.putExtra("dakkak", e15.getText().toString());
				startActivity(email15);
				
			}
		});
        
        
        CheckedTextView p15=(CheckedTextView) findViewById(R.id.checkedTextView60_office_amman);
        p15.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone15=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265601076"));
				startActivity(phone15);
			}
		});
        
        
// office 16
        
        CheckedTextView t16=(CheckedTextView) findViewById(R.id.checkedTextView62_office_amman);
        t16.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web16=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.dounatours.com"));
				startActivity(web16);
			}
		});
        
        final CheckedTextView e16=(CheckedTextView) findViewById(R.id.checkedTextView63_office_amman);
        e16.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email16=new Intent(Offices_amman.this,Contact_us.class);
				email16.putExtra("douna", e16.getText().toString());
				startActivity(email16);
				
			}
		});
        
        
        CheckedTextView p16=(CheckedTextView) findViewById(R.id.checkedTextView64_office_amman);
        p16.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone16=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265548922"));
				startActivity(phone16);
			}
		});
        
        
// office 17
        
        CheckedTextView t17=(CheckedTextView) findViewById(R.id.checkedTextView66_office_amman);
        t17.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web17=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.enjoy-jordan.com"));
				startActivity(web17);
			}
		});
        
        final CheckedTextView e17=(CheckedTextView) findViewById(R.id.checkedTextView67_office_amman);
        e17.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email17=new Intent(Offices_amman.this,Contact_us.class);
				email17.putExtra("enjoy", e17.getText().toString());
				startActivity(email17);
				
			}
		});
        
        
        CheckedTextView p17=(CheckedTextView) findViewById(R.id.checkedTextView68_office_amman);
        p17.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone17=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265534544"));
				startActivity(phone17);
			}
		});
        
// office 18
        
        CheckedTextView t18=(CheckedTextView) findViewById(R.id.checkedTextView70_office_amman);
        t18.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web18=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tours-fm.com"));
				startActivity(web18);
			}
		});
        
        final CheckedTextView e18=(CheckedTextView) findViewById(R.id.checkedTextView71_office_amman);
        e18.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email18=new Intent(Offices_amman.this,Contact_us.class);
				email18.putExtra("flavor", e18.getText().toString());
				startActivity(email18);
				
			}
		});
        
        
        CheckedTextView p18=(CheckedTextView) findViewById(R.id.checkedTextView72_office_amman);
        p18.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone18=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265337863"));
				startActivity(phone18);
			}
		});
        
// office 19
        
        CheckedTextView t19=(CheckedTextView) findViewById(R.id.checkedTextView74_office_amman);
        t19.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web19=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.friendstours.org"));
				startActivity(web19);
			}
		});
        
        final CheckedTextView e19=(CheckedTextView) findViewById(R.id.checkedTextView75_office_amman);
        e19.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email19=new Intent(Offices_amman.this,Contact_us.class);
				email19.putExtra("friends", e19.getText().toString());
				startActivity(email19);
				
			}
		});
        
        
        CheckedTextView p19=(CheckedTextView) findViewById(R.id.checkedTextView76_office_amman);
        p19.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone19=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264617506"));
				startActivity(phone19);
			}
		});
        
        
// office 20
        
        CheckedTextView t20=(CheckedTextView) findViewById(R.id.checkedTextView78_office_amman);
        t20.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web20=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.gaia-tours.com"));
				startActivity(web20);
			}
		});
        
        final CheckedTextView e20=(CheckedTextView) findViewById(R.id.checkedTextView79_office_amman);
        e20.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email20=new Intent(Offices_amman.this,Contact_us.class);
				email20.putExtra("gaia", e20.getText().toString());
				startActivity(email20);
				
			}
		});
        
        
        CheckedTextView p20=(CheckedTextView) findViewById(R.id.checkedTextView80_office_amman);
        p20.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone20=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265529776"));
				startActivity(phone20);
			}
		});
        
        
		
		
		
	}

}
