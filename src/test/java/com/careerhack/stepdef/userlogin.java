package com.careerhack.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class userlogin {
	
	WebDriver driver;
	
	@Given("^I am on OsCommerce homepage$")
	public void i_am_on_OsCommerce_homepage()  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	

	@When("^I click on log yourself in link$")
	public void i_click_on_log_yourself_in_link()  {
		
		WebElement link;
		link = driver.findElement(By.linkText("log yourself in"));
		link.click();
		
		
	}

	@When("^I enter valid \"([^\"]*)\"$")
	public void i_enter_valid(String email)  {
		driver.findElement(By.name("email_address")).sendKeys(email);
		
	}

	@When("^I enter correct \"([^\"]*)\"$")
	public void i_enter_correct(String password) {
		
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^I click on Sign in button$")
	public void i_click_on_Sign_in_button()  {
		
	
	}

	@Then("^I am on my OsCommerce page$")
	public void i_am_on_my_OsCommerce_page()  {


}
	
}