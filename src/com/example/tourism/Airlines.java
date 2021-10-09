package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;

public class Airlines extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.airlines);
        
        CheckedTextView w1=(CheckedTextView) findViewById(R.id.checkedTextView1_al);
        w1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.rj.com"));
				startActivity(web1);
			}
		});
        
        final CheckedTextView e1=(CheckedTextView) findViewById(R.id.a1);
        e1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email1=new Intent(Airlines.this,Contact_us.class);
//				email1.putExtra("al1_to", e1.getText().toString());
				startActivity(email1);
				
			}
		});
        
        
        CheckedTextView p1=(CheckedTextView) findViewById(R.id.checkedTextView3_al);
        p1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone1=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096265202000"));
				startActivity(phone1);
			}
		});
        
        
        
        CheckedTextView w2=(CheckedTextView) findViewById(R.id.checkedTextView4_al);
        w2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.royalwings.com.jo"));
				startActivity(web2);
			}
		});
        
        
        
        CheckedTextView w3=(CheckedTextView) findViewById(R.id.checkedTextView5_al);
        w3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jordanaviation.jo"));
				startActivity(web3);
			}
		});
        
        final CheckedTextView e3=(CheckedTextView) findViewById(R.id.checkedTextView6_al);
      e3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
        		// TODO Auto-generated method stub
				
				Intent email2=new Intent(Airlines.this,Contact_us.class);
//				email2.putExtra("al2_to", e3.getText().toString());
				startActivity(email2);
				
			}
		});     
        CheckedTextView w4=(CheckedTextView) findViewById(R.id.checkedTextView7_al);
        w4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent web4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.arabwings.com.jo"));
				startActivity(web4);
			}
		});
        
        final CheckedTextView e4=(CheckedTextView) findViewById(R.id.checkedTextView8_al);
        e4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent email4=new Intent(Airlines.this,Contact_us.class);
//				email4.putExtra("al4_to", e4.getText().toString());
				startActivity(email4);
				
			}
		});
        
        
        CheckedTextView p4=(CheckedTextView) findViewById(R.id.checkedTextView9_al);
        p4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent phone4=new Intent(Intent.ACTION_DIAL,Uri.parse("tel: 0096264899790"));
				startActivity(phone4);
			}
		});
        
        
}
}