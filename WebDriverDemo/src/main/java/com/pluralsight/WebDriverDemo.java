package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchField= driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		Thread.sleep(1000);
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
		
		//driver.getPageSource().contains("whatever you want to check");
	}

}
 