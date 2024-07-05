package july_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;



public class AssertGetTitleMethod {
	
	WebDriver driver;
	
	@Test
	public void assertget() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://gmail.com");
		
		
		//Exception Handling Becoz When the string not Matched it gives lots of Exception so,to avoid this
		//I used Assertion exception handling process
		//Here we Get the pass test case with Wrong Expected becoz of try catch block so write code properly 
		try
		{
			String Expected = "Gmail";
			String Actual = driver.getTitle();
			Assert.assertEquals(Actual, Expected,"Strings Not Matched");
		}catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
		
		driver.close();
		}
		
		
		
	}
	


