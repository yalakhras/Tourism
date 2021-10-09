package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_petra5 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_petra5);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_hp5);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.petramarriott.com"));
				startActivity(web1);
			}
		});
        
        
// hotel 2
        
        CheckedTextView t2=(CheckedTextView) findViewById(R.id.checkedTextView4_hp5);
        t2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.moevenpick-hotels.com"));
				startActivity(web2);
			}
		});
        
        final CheckedTextView e2=(CheckedTextView) findViewById(R.id.checkedTextView5_hp5);
        e2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
								
				Intent email2=new Intent(Hotels_petra5.this,Contact_us.class);
				email2.putExtra("movenpick", e2.getText().toString());
				startActivity(email2);
				
			}
		});
        
        
        CheckedTextView p2=(CheckedTextView) findViewById(R.id.checkedTextView6_hp5);
        p2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent phone2=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096232157201"));
				startActivity(phone2);
			}
		});
		
		
		
	}

}
