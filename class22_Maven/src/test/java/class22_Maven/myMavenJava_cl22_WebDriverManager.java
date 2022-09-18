package class22_Maven;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myMavenJava_cl22_WebDriverManager {

	// updating a Maven project --> Right Click on the class/Project> Maven> update project
	 
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarke\\Driver\\chromedriver.exe");

		//ChromeOptions options = new ChromeOptions();
		
		// WebdriverManager will check my browser and execute relevant chromedriver.exe file by itself
		// And I do not need to check chrome version and chromedriver.exe version
		WebDriverManager.chromedriver().setup();
		
		// Instantiate driver object by ChromeDriver Constructor
		WebDriver driver = new ChromeDriver();
		
		
		// go to youtube.com
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();  // maximize window
		
		
		driver.quit();
		
	}

}
