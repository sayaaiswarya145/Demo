import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {
	 @FindBy(xpath = "//select[@id='dropdown-class-example']")
	    private WebElement Dropdown;
	 private static WebDriver driver;
	    // Constructor to initialize WebElements
	    public DynamicTable(WebDriver driver) {
	        PageFactory.initElements(driver, this); // Initialize elements
	    }
	    
	//@FindBy(xpath="//select[@id='dropdown-class-example']");
	@Test
	public void demo() throws InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Dropdown.click();
	//driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
	List<WebElement> li =driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option"));
	for(WebElement x:li) {
		System.out.println(x.getText());
	}
	

}
}



