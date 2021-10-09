package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Hotels_deadsea4 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotels_deadsea4);
		
// hotel 1
		
		CheckedTextView t1=(CheckedTextView) findViewById(R.id.checkedTextView2_hd4);
        t1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.deadseaspahotel.com"));
				startActivity(web1);
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView4_hd4);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096253561000"));
				startActivity(phone1);
			}
		});
		
		
	}

}
