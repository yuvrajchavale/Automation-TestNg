package july_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		
		
		
		
		
	}
	
	@Test(dataProvider = "loginCredentials")
	public void verifyTitle(String User, String Password)
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.orangehrm.qedgetech.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		Assert.assertTrue(Actual.contains(Expected), "Invalid Credentials");
		
	}
	
	@DataProvider
	public Object[][] loginCredentials() 
	{
		Object[][] credentails = {{"Admin","Qedge123!@#"},
				                  {"Admin","UYB@12UB"},
				                  {"Dumdum","Qedge@123!@#"},
				                  {"12345","KNJNK"},
				                  {"   ","    "}};
		
		return credentails;
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
