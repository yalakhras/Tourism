package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Places_a extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.places_a);
	        
	        Button amman=(Button) findViewById(R.id.amman_places_a);
	        amman.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l1=new Intent(Places_a.this,Amman_a.class);
					startActivity(l1);
					
				}
			});
	        
	        Button karak=(Button) findViewById(R.id.karak_places_a);
	        karak.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l2=new Intent(Places_a.this,Karak_a.class);
					startActivity(l2);
					
				}
			});
	        
	        Button ajlun=(Button) findViewById(R.id.ajlun_places_a);
	        ajlun.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l3=new Intent(Places_a.this,Ajlun_a.class);
					startActivity(l3);
				}
			});
	        
	        Button deadsea=(Button) findViewById(R.id.dead_sea_places_a);
	        deadsea.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l4=new Intent(Places_a.this,DeadSea_a.class);
					startActivity(l4);
				}
			});
	        
	        Button jerash=(Button) findViewById(R.id.jerash_places_a);
	        jerash.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l5=new Intent(Places_a.this,Jerash_a.class);
					startActivity(l5);
				}
			});
	        
	        Button petra=(Button) findViewById(R.id.petra_places_a);
	        petra.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l6=new Intent(Places_a.this,Petra_a.class);
					startActivity(l6);
				}
			});
	        
	        Button irbid=(Button) findViewById(R.id.irbid_places_a);
	        irbid.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l7=new Intent(Places_a.this,Irbid_a.class);
					startActivity(l7);
				}
			});
	        
	        Button salt=(Button) findViewById(R.id.salt_places_a);
	        salt.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l8=new Intent(Places_a.this,Salt_a.class);
					startActivity(l8);
				}
			});
	        
	        Button madaba=(Button) findViewById(R.id.madaba_places_a);
	        madaba.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l9=new Intent(Places_a.this,Madaba_a.class);
					startActivity(l9);
				}
			});
	        
	        Button umm_qays=(Button) findViewById(R.id.umm_qays_places_a);
	        umm_qays.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l10=new Intent(Places_a.this,Ummqays_a.class);
					startActivity(l10);
				}
			});
	        
	        Button maeen=(Button) findViewById(R.id.maeen_places_a);
	        maeen.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l11=new Intent(Places_a.this,Maeen_a.class);
					startActivity(l11);
				}
			});
	        
	        Button rum=(Button) findViewById(R.id.wadi_rum_places_a);
	        rum.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l12=new Intent(Places_a.this,Wadi_Rum_a.class);
					startActivity(l12);
				}
			});
	        
	        Button aqaba=(Button) findViewById(R.id.aqaba_places_a);
	        aqaba.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l13=new Intent(Places_a.this,Aqaba_a.class);
					startActivity(l13);
				}
			});
	        
	        Button umm_aljimal=(Button) findViewById(R.id.umm_aljimal_places_a);
	        umm_aljimal.setOnClickListener(new View.OnClickListener() {
				
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent l14=new Intent(Places_a.this,Umm_aljimal_a.class);
					startActivity(l14);
				}
			});	        
	        
	 }
}