package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKartTest {
	
	@Test(priority = 3)
	public void flipkart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));

		Actions act = new Actions(driver);

		act.moveToElement(fashion).perform();
		Thread.sleep(3000);

		WebElement fashion2 = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));

		act.moveToElement(fashion2).perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text() ='Women Sarees']")).click();
		
		driver.quit();

	}


}
