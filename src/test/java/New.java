import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	private static WebDriver driver;
	@Test
	public void demo() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	String e = driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']")).getText();
    System.out.println(e);	
    Thread.sleep(3000);
    driver.findElement(By.partialLinkText("Selenium")).click();
    Thread.sleep(3000);
    Set<String> se = driver.getWindowHandles();
    List<String>l = new ArrayList<String>(se);
    driver.switchTo().window(l.get(1));
    Thread.sleep(5000);
    System.out.println(driver.getTitle());
    WebElement s= driver.findElement(By.xpath("//input[@class='nav__item nav__search gradient-input']"));
    s.click();
    s.sendKeys(e);
	

}
}
