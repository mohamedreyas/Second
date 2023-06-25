package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fbpojo extends Base {
	
	public Fbpojo() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtemail;
	
	
	@FindBys({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(id="pass")
	})
	
	private WebElement txtpass;
	
	@FindAll({
		@FindBy(xpath="//button[@value='1']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	
	private WebElement btnlogin;
	
	
	
	
	/**
	 * @return the txtemail
	 */
	public WebElement getTxtemail() {
		return txtemail;
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
