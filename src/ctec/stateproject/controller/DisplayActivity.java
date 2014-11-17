package ctec.stateproject.controller;

import ctec.stateproject.model.AndroidState;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends Activity
{
	/**
	 * declares a text view.
	 */
	private TextView displayView;
	/**
	 * declares a button.
	 */
	private Button homeButton;
	/**
	 * declares the state.
	 */
	private AndroidState appState;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		/**
		 * creates the app and layout.
		 */
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		/**
		 * finds the id of the text view, button, and creates the app state.
		 */
		displayView = (TextView) findViewById(R.id.resultView);
		homeButton = (Button) findViewById(R.id.homeButton);
		appState = (AndroidState) this.getApplication();
		
		showTransferInput();
		
		setupListeners();
	}
	
	    /**
	     * shows the data from the first screen in a usable form.
	     */
		private void showTransferInput()
		{
			displayView.setText(appState.getName() + " says: " + appState.getPhrase()
					            + " because they think " + appState.getBlather()
					            + " when they are " + appState.getAge());
		}
		
		/**
		 * creates a listener for a button to go to the home page.
		 */
		private void setupListeners()
		{
			homeButton.setOnClickListener(new View.OnClickListener()
			{
				
				@Override
				public void onClick(View v)
				{
					Intent returnIntent = new Intent();
					setResult(RESULT_OK, returnIntent);
					finish();
					
				}
			});
		}
	
}
