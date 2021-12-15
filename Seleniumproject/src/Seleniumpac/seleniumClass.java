package Seleniumpac;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class seleniumClass {
	
	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		//launch the chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@ aria-label='Search']")).click();
		driver.findElement(By.xpath("//input[@ aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@ aria-label='Search']")).sendKeys("Samsung M40");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	void test() {
		
	}

}
