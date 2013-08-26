package au.edu.jcu.it.cp2013;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class AdminLogin extends Activity {
	
	public final String ADMINPASSWORD = "Password1";
	public boolean passwordStatus = false;
	public EditText passwordField = (EditText) R.findViewById(adminPasswordField);
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.admin_login, menu);
		return true;
	}
	
	
	
	public void checkPassword(){
		
		if(passwordInput.equals(ADMINPASSWORD) {
			Intent intent = new Intent(this, AdminActivity.class)
		} else {
			
			
			
			
		}
	}
	
	public void submitLogin(View view) {
		checkPassword();
		
	}

}
