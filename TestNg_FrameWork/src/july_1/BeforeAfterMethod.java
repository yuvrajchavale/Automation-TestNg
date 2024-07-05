package july_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Reporter.log("Browser Launching", true);

	} 

	@Test
	public void branches() 
	{
		driver.findElement(By.xpath("//img[contains(@src,'images/Branches_but.jpg')]")).click();
		Reporter.log("Click on Branches", true);
	}

	@Test
	public void roles() 
	{
		driver.findElement(By.xpath("//img[contains(@src,'images/Roles_but.jpg')]")).click();
		Reporter.log("Click on Roles", true);	
	}

	@Test
	public void users() 
	{
		driver.findElement(By.xpath("//img[contains(@src,'images/Users_but.jpg')]")).click();
		Reporter.log("Click on Users", true);
	}

	@Test
	public void employees() 
	{
		driver.findElement(By.xpath("//img[contains(@src,'images/emp_btn.jpg')]")).click();
		Reporter.log("Click on Employees", true);
	}

	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
		Reporter.log("Closing the site",true);
	}

}
