package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Documents/PluralSight/WebDriverDemo/src/main/webapp/RadioButtonTest.html");
		
		//Get list of radio buttons
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(1).click();
		
		for (WebElement radioButton : radioButtons){
			if(radioButton.isSelected()){
				System.out.println(radioButton.getAttribute("value"));
			}
			
		}
	}

}
