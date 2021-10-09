package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_aqaba3 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_aqaba3);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_haq3);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.myhotel-jordan.com"));
				startActivity(web1);
			}
		});
        
        final CheckedTextView e1=(CheckedTextView) findViewById(R.id.checkedTextView3_haq3);
        e1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email1=new Intent(Hotels_aqaba3.this,Contact_us.class);
				email1.putExtra("my hotel", e1.getText().toString());
				startActivity(email1);
				
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_haq3);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232030890"));
				startActivity(phone1);
			}
		});
		
		
		
		
	}

}
