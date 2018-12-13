package com.ford.pom_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ford.pom_framework.helpers.StaticUtilities;

public class IndexPage {
	
	private By elementHeaderLogo = By.xpath("//div[@class='header']/h1/a/img[@alt='Ford Accessories']");
	private By elementFooterLogo = By.xpath("//div[@class='sub-footer']/a/img[@alt='Ford Accessories']");	
	private By elementInteriorTopLevelNav = By.xpath("//ul[@id='nav']/li[@class='level0 nav-1 first parent level-top']/a/span");
	private By elementInteriorCategoryFilter = By.xpath("//ul[@id='category_filter']/li/a[@title='Interior']/img");
	private By elementWheelsCategoryFilter = By.xpath("//ul[@id='category_filter']/li/a[@title='Wheels']/img");
	private By elementElectronicsCategoryFilter = By.xpath("//ul[@id='category_filter']/li/a[@title='Electronics']/img");
	private By elementBedProductsCategoryFilter = By.xpath("//ul[@id='category_filter']/li/a[@title='Bed Products']/img");
	private By elementExteriorCategoryFilter = By.xpath("//ul[@id='category_filter']/li/a[@title='Exterior']/img");
	private By elementRemoteStartBlockContent = By.xpath("//div[@class='block-content']/ul/li/a[@title='Shop Remote Start Systems']/img");
	private By elementBedProductsBlockContent = By.xpath("//div[@class='block-content']/ul/li/a[@title='Shop F-150 Bed Products']/img");
	private By elementFloorMatsBlockContent = By.xpath("//div[@class='block-content']/ul/li/a[@title='Shop All-Weather Floor Mats']/img");
	private By elementFancyBoxOuter = By.xpath("//div[@id='fancybox-outer']");
	private By elementFancyBoxOuterModel = By.xpath("//select[@id='model-select-modal']");
	private By elementFancyBoxOuterYear = By.xpath("//select[@id='year-select-modal']");
	private By elementFancyBoxOuterButtonGo = By.xpath("//button[@id='vehicle-button-modal']/span/span");
	private By elementFancyBoxOuterModeldrp = By.xpath("//div[@class='dropdown rel_id_model-select-modal rel_cls_hidden_select']/dl/dt/a");
	private By elementFancyBoxOuterYeardrp = By.xpath("//div[@class='dropdown rel_id_year-select-modal rel_cls_hidden_select']/dl/dt/a");

	
	public Boolean verifyHeaderLogoLink(WebDriver driver) throws Exception{
		try {
			WebElement headerLogoLink = driver.findElement(elementHeaderLogo);
			Boolean doesHeaderLogoLinkExist = headerLogoLink.isEnabled();
			return doesHeaderLogoLinkExist;			
		} catch (Exception ex) {
			throw ex; 
		}
	}
	
	public Boolean verifyFooterLogoLink(WebDriver driver) throws Exception{
		try {
			WebElement footerLogoLink = driver.findElement(elementFooterLogo);
			Boolean doesFooterLogoLinkExist = footerLogoLink.isEnabled();
			return doesFooterLogoLinkExist;			
		} catch (Exception ex) {
			throw ex; 
		}
	}

	public Boolean verifyElectronicsCatagoryFilter(WebDriver driver) throws Exception{
		try {
			WebElement electronicsCatagoryFilterLink = driver.findElement(elementElectronicsCategoryFilter);
			Boolean doeselectronicsCatagoryFilterLinkExist = electronicsCatagoryFilterLink.isEnabled();
			return doeselectronicsCatagoryFilterLinkExist;			
		} catch (Exception ex) {
			throw ex; 
		}
	}
	
	public Boolean verifyFancyBoxOuterIsVisibile(WebDriver driver) throws Exception{
		try {
			WebElement fancyBoxOuter = driver.findElement(elementFancyBoxOuter);
			Boolean isFancyBoxOuterVisble = fancyBoxOuter.isDisplayed();
			return isFancyBoxOuterVisble;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickInteriorBlockContent(WebDriver driver) throws Exception{
		try {
			driver.findElement(elementInteriorCategoryFilter).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage selectVehicleModelFancyOuterBox(WebDriver driver, String model) throws Exception{
		try {
			StaticUtilities.waitForVisibileElement(driver, elementFancyBoxOuterModeldrp).click();
			Select drpFancyOuterBoxModel = new Select(StaticUtilities.waitForExistanceOfElement(driver, elementFancyBoxOuterModel));
			drpFancyOuterBoxModel.selectByValue(model);
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage selectVehicleYearFancyOuterBox(WebDriver driver, String year) throws Exception{
		try {
			StaticUtilities.waitForVisibileElement(driver, elementFancyBoxOuterYeardrp).click();			
			Select drpFancyOuterBoxYear = new Select(StaticUtilities.waitForExistanceOfElement(driver, elementFancyBoxOuterYear));
			drpFancyOuterBoxYear.selectByValue(year);
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}	
	
	public IndexPage clickFancyOuterBoxGoButton(WebDriver driver) throws Exception{
		try {
			driver.findElement(elementFancyBoxOuterButtonGo).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickAshOrCoinCupTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-1 active first']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickCargoOrgTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-2 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickDoorSillTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-3 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickFloorMatsTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-4 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickGearShiftTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-5 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickTrimKitsTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-6 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickSeatCoversTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-7 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickSportPedalsTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='level1 nav-1-8 active']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public IndexPage clickViewAllTopLevelNavInterior(WebDriver driver) throws Exception{
		try {
			WebElement interiorTopLevelNav = driver.findElement(elementInteriorTopLevelNav);
			Actions action = new Actions(driver);
			action.moveToElement(interiorTopLevelNav).build().perform();
			driver.findElement(By.xpath("//ul[@class='level0']/li[@class='view-all last']/a/span")).click();
			return this;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	
}