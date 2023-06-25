package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpojo extends Base{
	public WebDriver driver;
	public Facebookpojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlogin;

	/**
	 * @return the txtEmail
	 */
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	/**
	 * @return the txtpass
	 */
	public WebElement getTxtpass() {
		return txtpass;
	}

	/**
	 * @return the btnlogin
	 */
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	


}
