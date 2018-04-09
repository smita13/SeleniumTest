package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Documents/PluralSight/WebDriverDemo/src/main/webapp/TableTest.html");
		
		WebElement outerTable = driver.findElement(By.tagName("table"));
		WebElement innerTable = driver.findElement(By.tagName("table"));
		WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		System.out.println(row.getText());
	
	}

}
