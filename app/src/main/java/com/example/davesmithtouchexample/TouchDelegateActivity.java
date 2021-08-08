/*
 * Copyright (c) 2012 Wireless Designs, LLC
 *
 * See the file license.txt for copying permission.
 */
package com.example.davesmithtouchexample;

import android.os.Bundle;

import com.example.davesmithtouchexample.widget.TouchDelegateLayout;

import androidx.appcompat.app.AppCompatActivity;

public class TouchDelegateActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TouchDelegateLayout layout = new TouchDelegateLayout(this);
		setContentView(layout);
	}
}
