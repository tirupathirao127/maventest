package com.automationpractice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRegisterPage {
	WebDriver driver;
	
	public LoginRegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void login(String email, String password) {
		WebElement emailTextBox = driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passwd"));
		WebElement signinButton = driver.findElement(By.id("SubmitLogin"));
		
		emailTextBox.click();
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
		
		passwordTextBox.click();
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		
		signinButton.click();
	}
	
	public String authenticationErrorMessage() {
		WebElement authError = driver.findElement(By.xpath("//div[@class='alert alert-danger']//li"));
		return authError.getText();
	}
}
