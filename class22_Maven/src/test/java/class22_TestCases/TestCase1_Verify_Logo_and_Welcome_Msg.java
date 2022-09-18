package class22_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1_Verify_Logo_and_Welcome_Msg extends CommonClass{

	public static void main(String[] args) {


		driverSetUp();

		// TEST 1: Landing page logo verification
		String logoText = driver.findElement(By.xpath("//nav/h1")).getText();
		System.out.println(logoText);
		if (logoText.contains("MicroTech NA")) {
			System.out.println("Landing page Logo text verification - PASSED");			
		}else {
			System.out.println("Landing page Logo text verification - FAILED");
		}
		
		// TEST 2: Welcome Message of the page verification
		String titleText = driver.findElement(By.xpath("//div/h1")).getText();
		System.out.println(titleText);
		if (titleText.contentEquals("Welcome to MicroTech NA")) {
			System.out.println("Title Text verification - PASSED");			
		}else {
			System.out.println("Title Text verification - FAILED");
		}
		
		// Quit he browser
		driver.quit();
	}

}
