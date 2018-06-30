package com.Mukesh.MukeshDataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordpressLogin {

	WebDriver driver;
	@Test(dataProvider="TestData")
	
	public void login(String username,String password) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);;
	//	driver.findElement(By.xpath("////input[@id='usernameOrEmail']")).sendKeys(password);
		
		
	}
	
	@DataProvider(name="TestData")
	public Object[][] getdata(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="Test1";
		
		data[0][1]="Test2";
		
        data[1][0]="Test1";
		
		data[1][1]="Test2";
		

		
		return data;
		
	}
}
