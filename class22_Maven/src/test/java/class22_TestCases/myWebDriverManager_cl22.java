package class22_TestCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myWebDriverManager_cl22 {

	// updating a Maven project --> Right Click on the class/Project> Maven> update project
	 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		// Instantiate driver object by ChromeDriver Constructor
		WebDriver driver = new ChromeDriver();
		
		//REQ 1: Add landing page with logo and "Welcome ot MicrotechNA"
		//REQ 2: Add login Menu link to go to Login Page
		
		// Test Case 1: verify landignpage logo and welcome message
		driver.get("https://sit.skyschooling.com/microtech/index.html");
		driver.manage().window().maximize();  // maximize window
		
		
		//driver.quit();
		
	}

}
