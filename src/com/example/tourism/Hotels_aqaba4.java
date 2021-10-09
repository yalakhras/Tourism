package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_aqaba4 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_aqaba4);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_haq4);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.doubletree.com"));
				startActivity(web1);
			}
		});
        
        final CheckedTextView e1=(CheckedTextView) findViewById(R.id.checkedTextView3_haq4);
        e1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email1=new Intent(Hotels_aqaba4.this,Contact_us.class);
				email1.putExtra("double Tree", e1.getText().toString());
				startActivity(email1);
				
			}
		});
        
// hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView6_haq4);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.marinaplazahotel.com"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView7_haq4);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email2=new Intent(Hotels_aqaba4.this,Contact_us.class);
				email2.putExtra("marina", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView8_haq4);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232092900"));
				startActivity(phone2);
			}
		});
        
		
	}

}
