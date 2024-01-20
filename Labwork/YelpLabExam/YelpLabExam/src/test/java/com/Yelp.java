package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Yelp {
	 @Test
	  public void launchChrome() {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.yelp.com/");
		  WebElement search = driver.findElement(By.id("search_description"));
			search.sendKeys("Restaurants");
			driver.findElement(By.xpath("//*[@id=\"header_find_form\"]/div[3]/button")).click();
			WebElement title = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[1]/div/div/div/div[2]/div[1]/h1"));
			String heading = title.getText();
			assertEquals(heading, "Top 10 Best Restaurants Near San Francisco, California");

	 }

}
