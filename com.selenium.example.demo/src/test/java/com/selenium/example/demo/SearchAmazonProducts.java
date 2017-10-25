package com.selenium.example.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.pages.AmazonPages;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchAmazonProducts {
	
	WebDriver driver;
	AmazonPages ap;
	Scenario scenario;
	
	@Before
	public void print(Scenario scenario)
	{
		scenario.write("hi baskar");
	}
	
	@Given("^I've a valid set of products to access amzon\\.es search page$")
	public void i_ve_a_valid_set_of_products_to_access_amzon_es_search_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:/Baskar/Workspace/TestData/eclipse/workspace/WalletHub/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("^I enter amazon url$")
	public void i_enter_amazon_url() throws Throwable {
		driver.get("https://www.amazon.es/");
	}

	@Then("^I went to amazon home page$")
	public void i_went_to_amazon_home_page() throws Throwable {
		System.out.println("Amazon home page title is : " + driver.getTitle());
	}

	@When("^Enter valid product name in the search area (.*)$")
	public void enter_valid_product_name_in_the_search_area_mi_note_mobile(String product) throws Throwable {
		System.out.println("HI " + product);
		Thread.sleep(3000);
		ap = new AmazonPages(driver);
		ap.setValueSearch(product);
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	}

	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		System.out.println("Hello");
		//wait until home page gets loaded
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")));
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();

	}

	@Then("^Sort products from low to high$")
	public void sort_products() throws Throwable {
		if(driver.findElement(By.id("sort")).isDisplayed())
		{
			Thread.sleep(3000);
			Select dp = new Select(driver.findElement(By.id("sort")));
			dp.selectByVisibleText("Precio: de m�s bajo a m�s alto");
		}
		else
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sortPopover']/a/i")).click();
		
		}

	}

	@Then("^Select product$")
	public void select_product() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Colorful Hard PC Funda Cover Case para Xiaomi MINote Mi Note PRO 5.7")).click();

	}

	@Then("^Click Add to wish list$")
	public void click_Add_to_wish_list() throws Throwable {
		if (driver.findElement(By.id("add-to-wishlist-button-submit")).isDisplayed())
		{
			Thread.sleep(3000);
			driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		}
		else
		{
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		}
		driver.quit();
	}

}
