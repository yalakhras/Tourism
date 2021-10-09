package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_petra3 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_petra3);
		
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_hp3);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.amrapalace.com"));
				startActivity(web1);
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView3_hp3);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232157070"));
				startActivity(phone1);
			}
		});
        
        
// hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView5_hp3);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.candlespetra.com"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView6_hp3);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email2=new Intent(Hotels_petra3.this,Contact_us.class);
				email2.putExtra("candles", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView7_hp3);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232156954"));
				startActivity(phone2);
			}
		});
		
		
	}

}
