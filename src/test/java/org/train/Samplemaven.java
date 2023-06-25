package org.train;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Demo.DemoTest.Base;

public class Samplemaven extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Browserlaunch();
		Lauchurl("https://www.facebook.com/");
		windowmax();
		title();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.name("email"));
		
		filltext(email, "Reyas@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		
		filltext(pwd, "1234");
		
		 WebElement clk = driver.findElement(By.name("login"));
		
		btnclk(clk);
		
		//Thread.sleep(3000);
		
		//screenshot("fblogin");
		
		//mousehover(email);
		

	}

}
