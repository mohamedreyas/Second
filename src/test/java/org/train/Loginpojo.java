package org.train;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.demo.Facebookpojo;
import org.openqa.selenium.WebElement;

import Demo.DemoTest.Base;

public class Loginpojo extends Base{
	
	public static void main(String args[]) {
		
		Browserlaunch();
		Lauchurl("https://www.facebook.com/");
		windowmax();
		
		Facebookpojo f = new Facebookpojo();
		
		WebElement txtEmail = f.getTxtEmail();
		
		filltext(txtEmail, "Reyas@gmail.com");
		
		filltext(f.getTxtpass(), "12345");
		
		btnclk(f.getBtnlogin());
		
	  
	}

}
