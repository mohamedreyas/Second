package org.train;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import org.demo.Facebookpojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Demo.DemoTest.Base;
import junit.framework.Assert;

public class Sample extends Base {
	
	@BeforeClass
	public static void bclass() {
		Browserlaunch();
		Lauchurl("https://www.facebook.com/");
		windowmax();
	}
	
	@Before
	public void bmethod() {
		
		System.out.println("TC Started");
		
	}
	
	@After
	public void amethod() {
		System.out.println("TC ended");
	}
	
	@AfterClass
	public static void aClass() {
		//driver.close();
		System.out.println("end");
	}
	
	@Test
	public void tc1() {
	  String title = title();
	Assert.assertTrue(false);
	}
	
	@Test
	public void tc3() {
		
		Facebookpojo f = new Facebookpojo();
	
		filltext(f.getTxtEmail(), "main");
		
		String value = f.getTxtpass().getAttribute("value");
		
		//Assert.assertEquals("Check the pwd value", "12345", "value");
		btnclk(f.getBtnlogin());
	}
	
	@Test
	public void tc2() {
		String currentUrl = driver.getCurrentUrl();
		
	
	}


}
