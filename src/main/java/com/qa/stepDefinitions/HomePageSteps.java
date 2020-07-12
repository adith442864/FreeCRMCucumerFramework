package com.qa.stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class HomePageSteps extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	    
	}

	@Then("^user logs into app$")
	public void user_logs_into_app() throws Throwable {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	   
	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		String hometitle = homePage.verifyHomePageTitle();
		System.out.println(hometitle);
		Assert.assertEquals("CRMPRO", hometitle);
	  
	}
	
	
	@Then("^validate logged in username$")
	public void validate_the_username() throws Throwable {
		Thread.sleep(3000);
		boolean flag = homePage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	 
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
		driver.quit();  
	}




}
