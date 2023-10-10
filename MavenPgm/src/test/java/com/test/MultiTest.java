package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest {
	
	WebDriver driver;

	@BeforeClass
	public void Initalization() {
		 driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		driver.manage().window().maximize(); // Maximize the browser

		System.out.println(driver.getTitle());
	}

	@Test(priority = 1)
	public void SelectDropDown() {

		WebElement dropdown = driver.findElement(By.name("country"));

		Select sel = new Select(dropdown);

		// sel.selectByIndex(3); //less priority

//	sel.selectByValue("BAKER ISLAND"); //Medium Priority

		// sel.selectByVisibleText("UNITED KINGDOM"); //High PRiority
		sel.selectByVisibleText("BHUTAN");

	}

	@Test(priority = 2)
	public void AdvanceDropDown() {

		WebElement dropdown = driver.findElement(By.name("country"));

		Select sel = new Select(dropdown);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());
		// System.out.println(li.get(0));

		for (int i = 0; i < li.size(); i++) // 0 0<263 // 1 0
		{

			System.out.println(li.get(i).getText()); // [].get(0).text() //

			if (li.get(i).getText().equalsIgnoreCase("INDIA")) {
				li.get(i).click();
				break;
			}
		}

	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}

}
