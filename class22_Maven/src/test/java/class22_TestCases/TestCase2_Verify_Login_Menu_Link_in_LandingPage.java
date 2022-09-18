package class22_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2_Verify_Login_Menu_Link_in_LandingPage extends CommonClass{

	public static void main(String[] args) {
		driverSetUp();
		
		// TEST: Login Page verification
		driver.findElement(By.xpath("//a[@href='elogin.php']")).click();
		
		String employeeLogin = driver.findElement(By.xpath("//div/h1")).getText();
		System.out.println(employeeLogin);
		
		// Quit he browser
		driver.quit();
	}

}
