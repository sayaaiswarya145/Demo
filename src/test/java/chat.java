import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.graphbuilder.struc.LinkedList;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class chat {
	private static WebDriver driver;
	@Test
   public void gpt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		para("GOPI378999","aish");
		para("2345654323","2345654323");
		para("@#%^&*&^%","aish");
	}
	public void para(String username, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		/*WebElement e =driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xtvsq51 xi112ho x17zwfj4 x585lrc x1403ito x1fq8qgq x1ghtduv x1oktzhs']"));
		Assert.assertTrue(e.isDisplayed());
		Assert.assertTrue(e.isEnabled());*/
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		
		/*driver.get("https://www.amazon.in/gp/bestsellers/gift-cards/ref=zg_bs_nav_gift-cards_0");
		Thread.sleep(4000);
		List<WebElement> li= driver.findElements(By.xpath("//div[contains(text(),'Amazon')]"));
		List<WebElement> l2 =driver.findElements(By.xpath("//div[contains(text(),'Amazon')]//ancestor :: a//following-sibling::div[2]"));
		List<String> i = new ArrayList<String>();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		for(int j=0;j<li.size();j++) {
			String name =li.get(j).getText();
			//System.out.println(name);
			String price =l2.get(j).getText();
			System.out.println(name+" "+price);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//String text = (String) js.executeScript("return arguments[0].textContent;", li);
			//System.out.println(text);
			//i.add(x.getText());
		}*/


	}
		
		
		
	
		
		
	}
