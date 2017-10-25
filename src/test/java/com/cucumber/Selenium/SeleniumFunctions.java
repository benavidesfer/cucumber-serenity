package com.cucumber.Selenium;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions {
	
	
public static WebDriver driver = null;
public static WebDriverWait waitVar = null;
public static String baseURL = "https://github.com/";


public void createDriver() throws MalformedURLException,
InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:/eclipse-workspace/Cucumber/chromedriver.exe");
driver = new ChromeDriver();
driver.get(baseURL);

waitVar = new WebDriverWait(driver, 15);
}


public void teardown() {
driver.quit();
}

public void ishomepageDisplayed() {
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.xpath("/html/body/div[4]/div[1]/div/div/div[3]/a")));

driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div[3]/a")).isDisplayed();

}

public void clickSigninLink() {
driver.findElement(By.linkText("Sign in")).click();
}

public void isloginsectionDisplayed() {
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.className("auth-form-body")));
waitVar.until(ExpectedConditions.presenceOfElementLocated(By
.name("commit")));
}

}