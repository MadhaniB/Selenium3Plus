package demoselenium3plus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
 

public class robotFramework {
	 public WebDriver driver;
	    public WebDriverWait wait;
	    private static String filePath = System.getProperty("user.dir") + "\\images\\sw-test-academy.png";
	 
	    @BeforeMethod
	    public void setup () {
	        driver = new ChromeDriver();
	        driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
	        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	        wait = new WebDriverWait(driver,10);
	        driver.manage().window().maximize();
	    }
	 
	    @Test
	    public void robotTest () throws InterruptedException {
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
	        driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
	        uploadFileWithRobot(filePath);
	        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated
	                (By.cssSelector(".name"))).getText().equals("sw-test-academy.png"));
	        Thread.sleep(2000);
	    }
	 
	    @AfterMethod
	    public void teardown () {
	        driver.quit();
	    }
	    public void uploadFileWithRobot (String imagePath) {
	        StringSelection stringSelection = new StringSelection(imagePath);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	 
	        Robot robot = null;
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }

}
