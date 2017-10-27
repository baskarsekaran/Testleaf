package wallethub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		String username = "baskar_smca@yahoo.co.in";
		String password = "baskar10576";
		
		//Launch chrome brower
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\TestData\\eclipse\\workspace\\WalletHub\\lib\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Launch url
		driver.get("https://www.facebook.com");
		
		//enter username
		driver.findElement(By.id("email")).sendKeys(username);
		
		//enter password
		driver.findElement(By.id("pass")).sendKeys(password);
		
		//click login button
		driver.findElement(By.id("loginbutton")).click();
		
		//wait until home page gets loaded
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create a Post")));
				
		Thread.sleep(5000);
				
		//click create a post link
		driver.findElement(By.linkText("Create a Post")).click();
				
		Thread.sleep(5000);
		
		//enter text
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[contains(text() , 'Tell your friends about your day.')]")));
		actions.click();
		actions.sendKeys("Hello World");
		actions.build().perform();
		
		//click post
		driver.findElement(By.xpath("//*[text()='Post']")).click();
		
		Thread.sleep(3000);
		
		//click navigation
		driver.findElement(By.xpath("//*[@id='logoutMenu']")).click();
		
		Thread.sleep(3000);
		
		//click logout
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
				
		//close the currentchrome browser
		driver.close();
	
	}

}
