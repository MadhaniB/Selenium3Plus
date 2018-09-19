package demoselenium3plus;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sun.glass.ui.Robot;
import com.sun.org.apache.bcel.internal.generic.Select;

import javafx.scene.control.Alert;


public class selectExample {
	
	public static void main(String[] arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208trng_b4a.04.28\\Downloads\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.goibibo.com/");
		

	WebElement clicking=driver.findElement(By.xpath("//*[@id=\"get_sign_in\"]"));
	clicking.click();
	WebElement frameid=driver.findElement(By.id("authiframe"));
	driver.switchTo().frame(frameid);
	driver.findElement(By.id("authMobile")).sendKeys("9629333183");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/a")).click();
	Thread.sleep(1000);
	driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");

	Set<String> s = driver.getWindowHandles();
	Iterator<String> it=s.iterator();
	
	String mwild=it.next();
	String t1=it.next();
	Thread.sleep(200);
	driver.switchTo().window(t1);
	Thread.sleep(200);
			
	}
		
	}
	
	

