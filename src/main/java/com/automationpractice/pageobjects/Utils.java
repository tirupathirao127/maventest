package com.automationpractice.pageobjects;

import org.openqa.selenium.WebDriver;

public class Utils {
	WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
