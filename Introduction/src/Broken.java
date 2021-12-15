import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(d.findElements(By.tagName("a")).size());
		Thread.sleep(3000);
		d.findElement(By.cssSelector("a[href*=\'soapui\']")).click();
		
		/*List<WebElement> l = d.findElements(By.id("gf-BIG"));
		SoftAssert a = new SoftAssert();
		for(WebElement li:l) {
			String u = li.getAttribute(null)
		}*/
		
		

	}

}
