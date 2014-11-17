package ctec.stateproject.controller;

import ctec.stateproject.model.AndroidState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.view.*;

public class StateActivity extends Activity
{
	/**
	 * creates a text field for age, name, phrase, and blather.
	 */
	private EditText ageField, nameField, phraseField, blatherField;
	/**
	 * creates a button to pass the data to the other string.
	 */
	private Button transferButton;
	/**
	 * Calls the app state.
	 */
	private AndroidState appState;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_state);
		/**
		 * finds the Id for the text fields and the button.
		 */
		ageField = (EditText) findViewById(R.id.ageField);
		nameField = (EditText) findViewById(R.id.nameField);
		phraseField = (EditText) findViewById(R.id.phraseField) ;
		blatherField= (EditText) findViewById(R.id.blatherField);
		transferButton = (Button) findViewById(R.id.transferButton);
		/**
		 * creates the app state.
		 */
		appState = (AndroidState) this.getApplication();
				
		setupListeners();
	}
	/**
	 * creates a listener for the button so that it knows when to transfer the data to the next screen.
	 */
	private void setupListeners()
	{
		transferButton.setOnClickListener(new View.OnClickListener()
		{
				public void onClick(View currentView)
				{
					gatherInformation();
					
					Intent transferIntent = new Intent(currentView.getContext(), DisplayActivity.class);
					startActivityForResult(transferIntent, 0);
				}		
		  });
	}
	/**
	 * this creates a method for the state to get the text from the text fields.
	 */
	private void gatherInformation()
	{
		appState.setAge(ageField.getText().toString());
		appState.setName(nameField.getText().toString());
		appState.setPhrase(phraseField.getText().toString());
		appState.setBlather(blatherField.getText().toString());
	}
}
