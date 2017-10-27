package wallethub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class WalletHub {

	public static void main(String[] args) throws InterruptedException {
		
		String username = "seleniumragu@gmail.com";
		String password = "@Sbi10576";
		
		//Launch chrome brower
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\TestData\\eclipse\\workspace\\WalletHub\\lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://wallethub.com");
		
		//click login
		driver.findElement(By.xpath("//*[@id='viewport']/header/div/nav[3]/a[1]")).click();
		
		//enter email address
		driver.findElement(By.name("em")).sendKeys(username);
		
		//enter password
		driver.findElement(By.name("pw")).sendKeys(password);
		
		//click login
		driver.findElement(By.xpath("//*[@id='join-login']/form/div[5]/button[2]")).click();
		
		Thread.sleep(5000);
		
		//navigate to
		driver.navigate().to("http://wallethub.com/profile/test_insurance_company/");
		
		//click ratings
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/span"))).click(driver.findElement(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a[5]"))).build().perform();;
		
		//select policy		
		driver.findElement(By.xpath("//*[@id='reviewform']/div[1]/div/div")).click();
		
		//select health link
		driver.findElement(By.linkText("Health")).click();
		
		Thread.sleep(3000);
		
		//click overall rating
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='overallRating']/a[5]")));
		actions.click();
		actions.build().perform();
	
		Thread.sleep(3000);
		
		//wait until review page gets loaded
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("review-content")));

		//enter review-content
		String msg = "test test test setstest test test setstest test test setstest test test setstest test test setstest test test setstest test test setstest test test setstest test test setstest test test etst tesbaskar";
		driver.findElement(By.id("review-content")).sendKeys(msg);
		
		Thread.sleep(5000);
		
		//click submit button
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='reviewform']/div[3]/div[2]/input")));
		actions.click();
		actions.build().perform();
		
		String msg1 = driver.findElement(By.xpath("//*[@id='review']/div[1]/h1/span")).getText();
		System.out.println(msg1);
		Assert.assertTrue(msg1, true);
		
		//navigate to profile page
		driver.navigate().to("https://wallethub.com/profile/seleniumragu/");
		
		Thread.sleep(3000);

		if(driver.findElement(By.linkText("Test Insurance Company")).isDisplayed())
		{
			driver.findElement(By.linkText("Test Insurance Company")).click();
			String msg2 = driver.findElement(By.id("reviews")).getText();
			//System.out.println(msg2);
			
			if(msg2.contains(msg)){
				Assert.assertTrue(msg2, true); 
				System.out.println("Assert Passed");
			}
		}
		else
		{
			String msg3 = driver.findElement(By.xpath("//*[contains(@id,'activity-content')]")).getText();
			//System.out.println(msg3);	
			if(msg3.contains(msg)){
				Assert.assertTrue(msg3, true); 
				System.out.println("Assert Passed");
			}
		}
		
		//click logout
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='viewport']/header/div/nav[3]/a[3]")));
		actions.click(driver.findElement(By.id("logout-link")));
		actions.build().perform();
		
		//close the currentchrome browser
		driver.close();
		
	}	

}
