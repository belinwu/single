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
package com.wujilin.single;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * The single click wrapper for views' click listener.
 *
 * @author Belin Wu
 */
public final class SingleClick implements OnClickListener {

	/**
	 * The interval between two clicks.
	 */
	private int interval = 800;

	/**
	 * The last click time.
	 */
	private long lastClickTime;

	/**
	 * The click listener.
	 */
	private OnClickListener listener;

	/**
	 * Constructs a single click wrapper.
	 *
	 * @param listener The click listener.
	 */
	private SingleClick(OnClickListener listener) {
		this.listener = listener;
	}

	@Override
	public final void onClick(View view) {
		long now = SystemClock.uptimeMillis();
		if (now - lastClickTime < interval) {
			return;
		}
		lastClickTime = now;
		if (listener != null) {
			listener.onClick(view);
		}
	}

	/**
	 * Wraps the click listener to the single click listener.
	 *
	 * @param listener The click listener.
	 * @return The single click listener.
	 */
	public static OnClickListener wrap(OnClickListener listener) {
		return new SingleClick(listener);
	}
}
