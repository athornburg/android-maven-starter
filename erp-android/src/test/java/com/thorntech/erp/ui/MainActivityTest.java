package com.thorntech.erp.ui;

import android.app.Activity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import com.thorntech.erp.ui.MainActivity;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest
{
	@Test
	public void testActivity()
	{
		Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

		Assert.assertTrue(activity != null);
	}
}
