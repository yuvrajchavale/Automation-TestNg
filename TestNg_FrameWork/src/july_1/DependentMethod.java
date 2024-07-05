package july_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependentMethod {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.orangehrm.qedgetech.com/");
		driver.findElement(By.xpath("//input [@name ='txtUsername']")).sendKeys("Admin");;
		driver.findElement(By.xpath("//input [@name ='txtPassword']")).sendKeys("Qedge123!@#");;
		driver.findElement(By.name("Submit")).click();;
		
		
	}
	
	@Test(groups = "HRM")
	public void admin() 
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	@Test(dependsOnMethods = "admin")
	public void pim()
	{
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}
	
	@Test(dependsOnMethods = "pim")
	public void leave() 
	{
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	}
	
	@Test(dependsOnMethods = "leave")
	public void time() 
	{
		driver.findElement(By.id("menu_time_viewTimeModule")).click();
	}
	
	
	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}

}
