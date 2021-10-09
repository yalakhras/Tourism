package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Contact_us1 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact_us1);
		
		CheckedTextView phone1=(CheckedTextView) findViewById(R.id.checkedTextView1);
		phone1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: +962787128635"));
				startActivity(i1);
			}
		});
		
		final CheckedTextView c_us=(CheckedTextView) findViewById(R.id.checkedTextView2);
		c_us.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i2=new Intent(Contact_us1.this,Contact_us.class);
				i2.putExtra("email_us", c_us.getText().toString());
				startActivity(i2);
			}
		});
		
		
	}

}
