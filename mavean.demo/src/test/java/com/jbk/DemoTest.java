package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void demotest1(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
	}

}
