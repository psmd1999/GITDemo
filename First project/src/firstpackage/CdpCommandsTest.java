package firstpackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.emulation.Emulation;

public class CdpCommandsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		DevTools devTools = d.getDevTools();
		devTools.createSession();
		/*Mapdevice = new HashMap();
		device.put("width", 600);
		device.put("height", 1000);
		device.put("deviceScaleFactor", 50);
		device.put("mobile", true);
		d.executeCdpCommand("Emulation.setDeviceMetricsOverride", device);
		d.get("https://rahulshettyacademy.com/angularAppdemo/");
		d.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("Library")).click();*/
		Map<String , Object> coor = new HashMap<String, Object>();
		coor.put("latitude", 40);
		coor.put("longitude", 3);
		coor.put("accuracy", 1);
		d.executeCdpCommand("Emulation.setGeolocationOverride", coor);
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		d.findElements(By.cssSelector(".Lc20lb")).get(0).click();
		String t = d.findElement(By.cssSelector(",our-story-card-title")).getText();
		System.out.println(t);
		
		
		
		
		

	}

}
