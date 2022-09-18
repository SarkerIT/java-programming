package class22_TestCases;

import org.openqa.selenium.By;

public class TestCase3_Verify_If_Emp_can_LogIn extends CommonClass{

	public static void main(String[] args) {
		driverSetUp();
		
		driver.findElement(By.xpath("//a[@href='elogin.php']")).click();
	}

}
