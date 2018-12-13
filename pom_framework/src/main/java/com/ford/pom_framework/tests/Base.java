package com.ford.pom_framework.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {

	protected static WebDriver driver = null;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeMethod
	@Parameters("browser")
	public void browserSelection(String browser) throws Exception {
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"./resources/geckodriver");
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"./resources/chromedriver");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("safari")) {
				System.setProperty("webdriver.safari.driver",
						"./resources/safaridriver");
				driver = new SafariDriver();
			} else {
				throw new Exception("Browser is not correct");
			}
		} catch (Exception ex) {
			throw ex;
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void initialize() throws Exception {
		try {
			String urlToNavigate = "https://accessories.ford.com/";
			driver.navigate().to(urlToNavigate);
//			driver.manage().window().maximize();
		} catch (Exception ex) {
			throw ex;
		}
	}
	

//	@BeforeTest
//	@Parameters("browser")
//	public void initializeReports(String browser) throws Exception {
//		try {
//			ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/fordAccessoriesReport.html");
//			ExtentReports extent = new ExtentReports();
//			extent.attachReporter(reporter);
//	        extent.setSystemInfo("Browser", browser);	
//		} catch (Exception ex) {
//			throw ex;
//		}
//		
//	}
	
	@AfterTest
	public void cleanUp() throws Exception {
		try {
			driver.quit();
		} catch (Exception ex) {
			throw ex;
		}
	}	
	
//	@AfterTest
//	public void flushEachTestReport() throws Exception {
//		try {
//			extent.flush();
//		} catch (Exception ex) {
//			throw ex;
//		}
//	}	
	
//	@AfterMethod
//	public void getTestReports(ITestResult result) throws Exception {
//		try {
//			if (result.getStatus() == ITestResult.FAILURE) {
//				logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
//				logger.fail(result.getThrowable());
//			} else if (result.getStatus() == ITestResult.SUCCESS) {
//				logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.GREEN));
//			} else {
//				logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
//				logger.skip(result.getThrowable());
//			}
//		} catch (Exception ex) {
//			throw ex;
//		}
//	}
	
}
