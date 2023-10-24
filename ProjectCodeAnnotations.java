package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectCodeAnnotations {

//	public static void main(String[] args) throws InterruptedException {

	WebDriver driver;

	@BeforeMethod
	public void startUp() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void function() throws InterruptedException {

		driver.get("https://www.makemytrip.com/");
		String url = driver.getCurrentUrl();

		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img"));
		boolean Contains = logo.isDisplayed();
		if (Contains) {
			System.out.println("logo is present");
			System.out.println("the current titke of the page is : " + url);
			Thread.sleep(3000);
		} else {
			System.out.println("Logo is not present");
			System.out.println("the current titke of the page is : " + url);
		}

		Thread.sleep(3000);

		WebElement cancelIcon = driver
				.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		WebElement fromCity = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
		WebElement toCity = driver.findElement(By.xpath("//input[@id=\"toCity\"]"));
		WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/p/a"));
		cancelIcon.click();
		Thread.sleep(1000);

		fromCity.click();
		WebElement inputbox1 = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		inputbox1.sendKeys("Rajah");
		Thread.sleep(3000);
		WebElement firstCity1 = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[1]/ul/li"));
		firstCity1.click();
		toCity.click();
		toCity.sendKeys("Mumbai");
		Thread.sleep(3000);
		WebElement firstCity2 = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div/div/ul/li[1]"));

		firstCity2.click();

		WebElement roundBtn = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]"));
		roundBtn.click();
		searchBtn.click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
