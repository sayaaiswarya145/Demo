
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	private static WebDriver driver;
	private static By username= By.xpath("//input[@placeholder='Username']");
	private static By password= By.id("password");
	private static By loginbutton= By.id("login-button");
	private static By Menu= By.xpath("//button[text()='Open Menu']");
	private static By logout= By.xpath("//a[text()='Logout']");
	
	
	@Test
	public void loginn()
	{
	    
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com/v1/index.html");
	    driver.findElement(username).sendKeys("standard_user");
	    driver.findElement(password).sendKeys("secret_sauce");
	    driver.findElement(loginbutton).click();
	    
	}
}
