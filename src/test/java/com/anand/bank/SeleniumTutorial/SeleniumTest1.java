package com.anand.bank.SeleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gogle.com");

	}

}
