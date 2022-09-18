package class22_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonClass {
	static WebDriver driver;
	
	public static void driverSetUp() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://sit.skyschooling.com/microtech/index.html");
		//driver.manage().window().maximize();
	}
}
