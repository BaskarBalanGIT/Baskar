
package com.Logingit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginGit_Module {
	WebDriver driver;

	@Given("^Open the Browser$")
	public void Open_the_Browser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Baskar Balan\\eclipse-workspace-2019-06\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

		@When("^user views the Title$")
	public void user_views_the_Title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("^the title should be as per requirement$")
	public void the_title_should_be_as_per_requirement() {
		// Write code here that turns the phrase above into concrete actions
		String title1 = driver.getTitle();
		System.out.println(title1);
	
	}
}