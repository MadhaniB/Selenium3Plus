package demoselenium3plus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;



public class flipkart {



	public void moveToElement(WebElement pwd) {
		// TODO Auto-generated method stub
		
	}

/*public static void main(String[] arg) throws InterruptedException
	{
		 	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A07208trng_b4a.04.28\\Downloads\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();

	driver.get("https://www.flipkart.com");
	
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\\\"container\\\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
		search.click();
		WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
		searchbox.click();
		searchbox.sendKeys("Shoes");
		Thread.sleep(200);
		searchbox.click();
		Thread.sleep(200);
		driver.navigate().back();
		searchbox.clear();
		searchbox.sendKeys("watches");
		searchbox.click();
		WebElement serchButton= driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button/svg"));
		serchButton.click();
		
	}
	*/
}


/*@BeforeMethod
public void openBrowser()
{
	//driver=driverclass.listofdriver(browser);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
	
}
*/

