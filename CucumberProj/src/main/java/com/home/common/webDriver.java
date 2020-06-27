package com.home.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriver {

	WebDriver driver;
	
	public String launchApplication() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		String apptitle = driver.getTitle();
		 driver.quit();
		 
		 return apptitle;
	
	}
	
	
	
	
}
