package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Sample {
	WebDriver driver;
	
		@Test
		public void tc1()
		{
		WebDriverManager.chromedriver().setup();
		//FirefoxOptions options=new FirefoxOptions();
		//options.addArguments("--remote-allow-origins");
		driver=new ChromeDriver();
		driver.get("http://live.techpanda.org/index.php/");
		}
		
		@Test
		public void tc2()
		{
		String title = driver.getTitle();
		System.out.println(title);
		//String ExpStr = "THIS IS DEMO SITE";
		//Assert.assertEquals(ExpStr, title);
		}
		
		@Test
		public void tc3()
		{
		driver.findElement(By.xpath("//*[text()='Mobile']")).click();
		String mobTitle = driver.getTitle();
		System.out.println(mobTitle);
		//String ExpMobStr = "Mobile";
		//Assert.assertEquals(ExpMobStr, mobTitle);
		
		
		WebElement mob = driver.findElement(By.xpath("(//select)[1]"));
		Select s=new Select(mob);
		s.selectByVisibleText("Name");
		
		List<WebElement> names = driver.findElements(By.xpath("//li[@class='item last']//div//h2"));
		for(int i=0;i<names.size();i++)
		{
			String text = names.get(i).getText();
			System.out.println(text);
		}
		
		}
	

}
