package com.ford.pom_framework.tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ford.pom_framework.pages.IndexPage;
import com.ford.pom_framework.pages.VehicleSearchResultsPage;

public class VerifyAccessoriesSearchResultsTest extends Base{

	@Test
	public void verifyInteriorSearchResults() throws Exception {
		try {
			List<String> productList = new ArrayList<String>();
			productList.add("Cargo Organizer - Soft-Sided Cooler Bag W/Adjustable Carrying Strap, Ford Logo");
			productList.add("Cargo Organizer - Soft-Sided Cooler Bag W/Adjustable Carrying Strap");
			IndexPage newIndexPage = new IndexPage();
			newIndexPage.clickInteriorBlockContent(driver);
			Assert.assertTrue(newIndexPage.verifyFancyBoxOuterIsVisibile(driver), "Fancy BoxOuter is not visible");
			newIndexPage.selectVehicleModelFancyOuterBox(driver, "Crown Victoria").selectVehicleYearFancyOuterBox(driver, "2007").clickFancyOuterBoxGoButton(driver);			
			VehicleSearchResultsPage newResultsPage = new VehicleSearchResultsPage();	
			Assert.assertEquals(newResultsPage.productListString(driver), productList, "Product(s) do not match");
			//System.out.println(newResultsPage.productListString(driver).get(0));
			//System.out.println(newResultsPage.productListString(driver).get(1));
		} catch (Exception ex) {
			throw ex;
		}
	}	
	
}


