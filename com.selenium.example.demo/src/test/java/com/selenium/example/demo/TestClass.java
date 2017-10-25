/*selenium-maven-jenkins https://www.youtube.com/watch?v=A4Z1F7gJvkY*/
/*Cucumber - https://www.youtube.com/watch?v=n2G8ApwTE2Q&list=PLmjcJNp9bQu-rWVEdLotVdYoWsmX2nWvL*/
package com.selenium.example.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void print(){
		System.out.println("hi");
		System.setProperty("webdriver.chrome.driver", "D:/Baskar/Workspace/TestData/eclipse/workspace/WalletHub/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		

	}

}
