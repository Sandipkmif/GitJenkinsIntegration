package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest {
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp= new LoginPage(driver);
		lp.loginToApplication();
		
		String Heading=driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		
		
		driver.close();
		Assert.assertEquals(Heading, "Dashboard Courses Offered");
	}
}



