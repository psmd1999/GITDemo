package firstpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class firstproject {

	//initialize webDriver component
	
	WebDriver driver;
	
	@BeforeEach
	//write all the pre testing steps like launching the browser, loading the URL stc.
	public void setUp() throws Exception {
		//launch the chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	}
	
	

    @AfterEach
	//write all the post testing steps like closing the browser,taking screenshot etc.
	public void tearDown() throws Exception {
		
		driver.close();
	}

    @Test
	//write the actual steps
	public void test() {
    	
    	}

}
