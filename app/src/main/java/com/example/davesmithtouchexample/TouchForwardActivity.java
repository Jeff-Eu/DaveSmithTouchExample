/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package com.example.davesmithtouchexample;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.davesmithtouchexample.widget.TouchForwardLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TouchForwardActivity extends AppCompatActivity {

	public static final String TAG = "TouchForwardActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TouchForwardLayout layout = new TouchForwardLayout(this);
		
		Button button = new Button(this);
		button.setText("You Can't Miss Me!");
		
		FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.CENTER);
		layout.addView(button, lp);
		setContentView(layout);

		button.setOnTouchListener((v, event) -> {
			Log.i(TAG, "button: " + event.getAction());
			return false;
		});
	}
}
