package com.example.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contact_us extends Activity {	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.contact_us);
	        
	    	Button buttonSend;
	    	final EditText textTo;
	    	final EditText textSubject;
	    	final EditText textMessage;
	     
	    		buttonSend = (Button) findViewById(R.id.buttonSend_cu);
	    		textTo = (EditText) findViewById(R.id.editTextTo_cu);
	    		textSubject = (EditText) findViewById(R.id.editTextSubject_cu);
	    		textMessage = (EditText) findViewById(R.id.editTextMessage_cu);
  			  
	    		buttonSend.setOnClickListener(new View.OnClickListener() {
					
					public void onClick(View arg0) {
						// TODO Auto-generated method stub						
					  String to = textTo.getText().toString();
	  			      String subject = textSubject.getText().toString();
		  			  String message = textMessage.getText().toString();
						
						if(to == null || to.length() <= 0){
							Toast.makeText(getApplicationContext(), "You forget to enter the Email", Toast.LENGTH_SHORT).show();}

	  			        if(subject == null || subject.length() <= 0){
							Toast.makeText(getApplicationContext(), "You forget to enter the Subject", Toast.LENGTH_SHORT).show();}
						
	  			        if(message == null || message.length() <= 0){
							Toast.makeText(getApplicationContext(), "You forget to enter the message", Toast.LENGTH_SHORT).show();}

						if(to != null && subject != null && message != null){
		     
		    			  Intent email = new Intent(Intent.ACTION_SEND);
		    			  email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
		    			  email.putExtra(Intent.EXTRA_SUBJECT, subject);
		    			  email.putExtra(Intent.EXTRA_TEXT, message);

		    			  //need this to prompts email client only
		    			  email.setType("message/rfc822");
		    			  
		    			  startActivity(Intent.createChooser(email, "Choose an Email client :"));}
					}
	    		});	    
	    		
	    		
// Contact_us1
	    		
	    		Bundle c1=getIntent().getExtras();
	    		String c2=c1.getString("email_us");
	    		textTo.setText(c2);
	    		
	    		
// Airlines
//	    			Bundle b1 = getIntent().getExtras();
//	    			String b2 = b1.getString("al1_to");		
//	    			textTo.setText(b2);
	    			
//	    			Bundle d1 = getIntent().getExtras();
//	    			String d2 = d1.getString("al2_to");
//	    			textTo.setText(d2);
	    			
//	    			Bundle e1 = getIntent().getExtras();
//	    			String e2 = e1.getString("al4_to");
//	    			textTo.setText(e2);

	 }
	    		
// Boolean method to check if entered email ID is valid or not
//		boolean isEmailValid(CharSequence email){
//    	return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
//		}
		
		
}