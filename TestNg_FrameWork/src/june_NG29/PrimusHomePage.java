package june_NG29;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class PrimusHomePage {


	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://primusbank.qedgetech.com/");
	}
	
	@Test
	public void personalBanking() 
	{
		driver.findElement(By.xpath("//a/img[contains(@src,'images/mainlinks_03.jpg')]")).click();
		Reporter.log("Personal Banking",true);
	}
	
	@Test
	public void corporateBanking() 
	{
       driver.findElement(By.xpath("//a/img[contains(@src,'images/mainlinks_04.jpg')]")).click();
       Reporter.log("Corporate Banking");
	}
	
	@Test
	public void internationalBanking() 
	{
      driver.findElement(By.xpath("//a/img[contains(@src,'images/mainlinks_05.jpg')]")).click();
      Reporter.log("International Bank");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
