package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameHandling {
	
	@Test

	public void FrameHandle() throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com");
		
		driver.manage().window().maximize(); //Maximize the browser
		
		System.out.println(driver.getTitle());
		
	
		
	WebElement support =	driver.findElement(By.xpath("//a[text()='Support ']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(support).perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
	
	driver.switchTo().frame("iframeChatBot"); //user is inside into the frame
	
	driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent(); //come out from the frame
	
	driver.findElement(By.id("chatbot_close_button")).click();
		
	Thread.sleep(2000);
	
	driver.findElement(By.id("chatbot_trigger_popup")).click(); //Open chatbox again
	driver.switchTo().frame("iframeChatBot"); //user is inside into the frame
	
	driver.findElement(By.xpath("//button[text()='Start a new chat']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='e-Tickets']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(6000);
	
	driver.findElement(By.id("login-input")).sendKeys("abc@gmail.com");

	driver.findElement(By.id("login-continue-btn")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("login-password")).sendKeys("12345");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.findElement(By.id("login-as-different-user")).click();
	driver.findElement(By.name("login-input")).sendKeys("4372195877");
	driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
	driver.findElement(By.id("google-login-btn")).click();
	
	//new window
	
	
	
	driver.quit();
	
	

	}

}
