package com.ford.pom_framework.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaticUtilities {

	public static WebElement waitForVisibileElement(WebDriver driver, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception ex){
			throw ex;
		}
	}
	
	public static WebElement waitForExistanceOfElement(WebDriver driver, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception ex){
			throw ex;
		}
	}
	
	
}
