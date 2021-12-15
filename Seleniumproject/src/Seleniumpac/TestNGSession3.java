package Seleniumpac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGSession3 {
	
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().window().maximize();
  }
  @Test
  public void SessionTest1() {
	  System.out.println("Google Application fgfgah");
  }
  @AfterMethod
  public void afterMethod() {
  }

}
