import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		DesiredCapabilities.
	    ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	    ChromeOptions c = new ChromeOptions();
	    c.merge(ch);
		
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.amazon.com");
		

	}

}
