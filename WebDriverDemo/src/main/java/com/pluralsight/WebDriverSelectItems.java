package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Documents/PluralSight/WebDriverDemo/src/main/webapp/SelectItemTest.html");
	
		WebElement selectElement = driver.findElement(By.id("select1"));
		//wrapper class for select class
		Select select = new Select(selectElement); 
		select.selectByVisibleText("Maybe");
	}

}
