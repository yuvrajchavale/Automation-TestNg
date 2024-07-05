package primusLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusBaseClass {

	public static WebDriver driver;
	
	public static void login(String user,String pass) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("txtuId")).sendKeys(user);
		driver.findElement(By.name("txtPword")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}
	
	public static void closeApp()
	{
		driver.quit();
	}

	
	
}
