package com.selenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class LoginTest {
WebDriver driver;
@BeforeTest
public void setup() {
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\swati\\myfirst\\SeleniumTestProject\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/swati/myfirst/SeleniumTestProject/index.html"); // Change this to your actual login page URL
}
@Test
public void testLogin() {
WebElement username = driver.findElement(By.id("username"));
WebElement password = driver.findElement(By.id("password"));
WebElement loginButton = driver.findElement(By.id("login"));
username.sendKeys("testuser");
password.sendKeys("password123");
loginButton.click();
}
@AfterTest
public void tearDown() {
driver.quit();
}
}