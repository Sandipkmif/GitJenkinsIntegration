package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LP {
	WebDriver driver;

	public LP(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement  getUname(){
		return driver.findElement(By.id("email"));
	}
	public WebElement getPassword(){
		return driver.findElement(By.id("password"));
	}
	public WebElement getLoginButton(){
		return driver.findElement(By.xpath("//button"));
		
	}
	
	public void loginToApplication2(){
		getUname().sendKeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getLoginButton().click();
	}

}
