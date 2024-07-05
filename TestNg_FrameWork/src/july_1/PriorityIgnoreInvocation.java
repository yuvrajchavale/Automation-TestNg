package july_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class PriorityIgnoreInvocation {
WebDriver driver;
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
	Reporter.log("Running in BeforeMethod",true);
}

//Priority works but the non priority run first if alphabetically other method came first
//Invocation for repatative run
//This method runs first becoz of alphabate still priority not give 
@Test
public void branches() 
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing Branches test",true);
	
}
//To ignore this test Case
@Test(enabled = false)
public void roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing Roles test",true);
	
}
//this method runs after Branches becoz of alphabetical order
@Test(priority = 0,invocationCount = 5)
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing Users test",true);
	
}
@AfterMethod
public void tearDown()
{
	
	driver.quit();
	Reporter.log("Running in Afetrmethod",true);
}
}

