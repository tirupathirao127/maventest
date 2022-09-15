package com.automationpractice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage {
	WebDriver driver;
	
	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickonSigninLink() {
		WebElement signinLink = driver.findElement(By.className("login"));
		signinLink.click();
	}
	
	public void search(String searchTerm) {
		WebElement searchTextBox = driver.findElement(By.id("search_query_top"));
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		
		searchTextBox.click();
		searchTextBox.clear();
		searchTextBox.sendKeys(searchTerm);
		
		searchButton.click();
	}
}
