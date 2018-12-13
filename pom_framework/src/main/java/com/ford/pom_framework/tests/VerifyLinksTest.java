package com.ford.pom_framework.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ford.pom_framework.pages.IndexPage;

public class VerifyLinksTest extends Base{
	
	@Test
	public void verifyHeaderFooter() throws Exception {
		try {
			IndexPage newIndexPage = new IndexPage();
			Assert.assertTrue(newIndexPage.verifyHeaderLogoLink(driver), "Header link does not exist");	
			Assert.assertTrue(newIndexPage.verifyFooterLogoLink(driver), "Footer link does not exist");
		} catch (Exception ex) {
			throw ex;
		}
	}	
	
	@Test
	public void verifyBlockContent() throws Exception {
		try {
			IndexPage newIndexPage = new IndexPage();
			Assert.assertTrue(newIndexPage.verifyElectronicsCatagoryFilter(driver), "Electronics Catagory Filter link does not exist");	
		} catch (Exception ex) {
			throw ex;
		}
	}
}





