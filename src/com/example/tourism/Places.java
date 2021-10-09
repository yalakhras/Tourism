package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Places extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.places);
	        
	        Button amman=(Button) findViewById(R.id.amman_places);
	        amman.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l1=new Intent(Places.this,Amman.class);
					startActivity(l1);
					
				}
			});
	        
	        Button karak=(Button) findViewById(R.id.karak_places);
	        karak.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l2=new Intent(Places.this,Karak.class);
					startActivity(l2);
					
				}
			});
	        
	        Button ajlun=(Button) findViewById(R.id.ajlun_places);
	        ajlun.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l3=new Intent(Places.this,Ajlun.class);
					startActivity(l3);
				}
			});
	        
	        Button deadsea=(Button) findViewById(R.id.dead_sea_places);
	        deadsea.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l4=new Intent(Places.this,DeadSea.class);
					startActivity(l4);
				}
			});
	        
	        Button jerash=(Button) findViewById(R.id.jerash_places);
	        jerash.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l5=new Intent(Places.this,Jerash.class);
					startActivity(l5);
				}
			});
	        
	        Button petra=(Button) findViewById(R.id.petra_places);
	        petra.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l6=new Intent(Places.this,Petra.class);
					startActivity(l6);
				}
			});
	        
	        Button irbid=(Button) findViewById(R.id.irbid_places);
	        irbid.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l7=new Intent(Places.this,Irbid.class);
					startActivity(l7);
				}
			});
	        
	        Button salt=(Button) findViewById(R.id.salt_places);
	        salt.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l8=new Intent(Places.this,Salt.class);
					startActivity(l8);
				}
			});
	        
	        Button madaba=(Button) findViewById(R.id.madaba_places);
	        madaba.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l9=new Intent(Places.this,Madaba.class);
					startActivity(l9);
				}
			});
	        
	        Button umm_qays=(Button) findViewById(R.id.umm_qays_places);
	        umm_qays.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l10=new Intent(Places.this,Ummqays.class);
					startActivity(l10);
				}
			});
	        
	        Button maeen=(Button) findViewById(R.id.maeen_places);
	        maeen.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l11=new Intent(Places.this,Maeen.class);
					startActivity(l11);
				}
			});
	        
	        Button rum=(Button) findViewById(R.id.wadi_rum_places);
	        rum.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l12=new Intent(Places.this,Wadi_Rum.class);
					startActivity(l12);
				}
			});
	        
	        Button aqaba=(Button) findViewById(R.id.aqaba_places);
	        aqaba.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l13=new Intent(Places.this,Aqaba.class);
					startActivity(l13);
				}
			});
	        
	        Button umm_aljimal=(Button) findViewById(R.id.umm_aljimal_places);
	        umm_aljimal.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l14=new Intent(Places.this,Umm_aljimal.class);
					startActivity(l14);
				}
			});

}
}
