package com.example.loginscreendemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StreamActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stream);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stream, menu);
		return true;
	}

}
