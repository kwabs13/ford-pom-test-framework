package com.ford.pom_framework.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleSearchResultsPage {

	private By elementSearchResultCount = By.xpath("//div[@class='page-title category-title']");
	private By elementSearchResultCatagory = By.xpath("//div[@class='page-title category-title']/h1/span");
	private By elementProductList = By.xpath("//ol[@id='products-list']/li/div/div/h2");	
	
	public List<String> productListString(WebDriver driver) throws Exception{
		try {
			List<WebElement> productListDiv = driver.findElements(elementProductList);
			List<String> productList = new ArrayList<String>();
			for(WebElement product : productListDiv) {
				productList.add(product.getText());
			}
			return productList;
		} catch (Exception ex) { 
			throw ex;
		}
	}
	
}
