/*
The MIT License (MIT)

Copyright (c) 2016 Belin Wu (http://wujilin.com)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.wujilin.single.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.wujilin.single.SingleClick;

public class MainActivity extends AppCompatActivity
		implements View.OnClickListener {

	private Button mClick;

	private Button mSingleClick;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_activity_main);
		mClick = (Button) findViewById(R.id.click);
		mSingleClick = (Button) findViewById(R.id.single_click);
		mClick.setOnClickListener(this);
		mSingleClick.setOnClickListener(SingleClick.wrap(this));
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.click:
				Log.d("MainActivity", "click");
				break;
			case R.id.single_click:
				Log.d("MainActivity", "single click");
				break;
		}
	}
}
