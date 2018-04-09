package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Documents/PluralSight/WebDriverDemo/src/main/webapp/CheckboxTest.html");
		
		WebElement checkBox = driver.findElement(By.id("lettuceCheckbox"));
		checkBox.click();
		checkBox.click();

	}

}
