package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");
		String url = driver.getCurrentUrl();

		Thread.sleep(5000);

		WebElement cancelIcon = driver
				.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img"));

		if (cancelIcon.isDisplayed()) {
			cancelIcon.click();
		} else {
			System.out.println("user is on home page");
		}

		boolean Contains = logo.isDisplayed();
		if (Contains) {
			System.out.println("logo is present");
			System.out.println("the current titke of the page is : " + url);
			Thread.sleep(3000);
			driver.quit();
		} else {
			System.out.println("Logo is not present");
			System.out.println("the current titke of the page is : " + url);
		}
	}

}
