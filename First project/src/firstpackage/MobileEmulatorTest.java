package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.emulation.Emulation;

import java.util.Optional;

public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		DevTools devTools = d.getDevTools();
		devTools.createSession();
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		d.get("https://rahulshettyacademy.com/angularAppdemo/");
		d.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Library")).click();

	}

}
