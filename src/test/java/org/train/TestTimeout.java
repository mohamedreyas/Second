package org.train;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.DemoTest.Base;

public class TestTimeout extends Base{
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		Browserlaunch();
		Lauchurl("http://demo.automationtesting.in/Alerts.html");
		windowmax();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Alert ')])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//Explicit wait - Webdriver wait
		//WebDriverWait w = new WebDriverWait (driver, 5);
		
		//Explicitwait - Fluent wait
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(Exception.class);
		
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
	
		
		
		
		
	    
}
		

}
