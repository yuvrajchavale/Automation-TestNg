package july_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdTestNGClass {
WebDriver driver ;
@BeforeTest
public void setUp() throws Throwable
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
}
@Test(groups = "HRM")
public void admin() throws Throwable
{
	driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	Thread.sleep(2000);
}
@Test(dependsOnMethods = "admin")
public void pim() throws Throwable
{
	driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	Thread.sleep(2000);
}
@Test(dependsOnMethods = "pim")
public void leave() throws Throwable
{
	driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	Thread.sleep(2000);
}
@Test(dependsOnMethods = "leave")
public void time() throws Throwable
{
	driver.findElement(By.xpath("//b[normalize-space()='Time']")).click();
	Thread.sleep(2000);
}
@AfterTest
public void tearDown()
{
	driver.quit();
}
}
