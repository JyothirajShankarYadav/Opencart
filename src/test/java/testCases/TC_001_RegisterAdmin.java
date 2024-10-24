package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.registerPage;

public class TC_001_RegisterAdmin 
{
  public org.apache.logging.log4j.Logger logger;
  public WebDriver driver;
  @BeforeClass
  void setup() throws InterruptedException
  {
	 logger = LogManager.getLogger(getClass());
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  logger.info("Chrome opened");
	  driver.manage().window().maximize();
	  driver.get("https://admin-demo.nopcommerce.com/admin/");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//button")).click();
	  Thread.sleep(5000);
	  
  }
  @AfterClass
  void tearDown()
  {
	  driver.quit();
	 logger.info("Chrome Closed");
  }
 // @Test
  void registerAdmin() throws Exception
  {
	  registerPage rp = new registerPage(driver);
	  
	  rp.male();
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	 // js.executeScript("arguments[0].scrollIntoView();", rp.lastTF());
	  Thread.sleep(3000);
	  rp.firstTF().sendKeys("Max");
	  rp.lastTF().sendKeys("Verstappen");
	  Select date = new Select(rp.Date());
	  Select month = new Select(rp.Month());
	  Select year = new Select(rp.Year());
	  date.selectByIndex(3);
	  month.selectByIndex(4);
	  year.selectByIndex(6);
	  Thread.sleep(3000);
	  rp.email().sendKeys("maxi@gmail.com");
	  js.executeScript("arguments[0].scrollIntoView();", rp.password());
	  Thread.sleep(1000);
	  rp.password().sendKeys("1St13me@48");
	  rp.conPass().sendKeys("1St13me@48");
	  rp.registerButton();
	  Thread.sleep(3000); 
	  driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	  Thread.sleep(3000);
	  rp.loginL();
	  Thread.sleep(3000);
  }
  @Test
  void login()
  {
	  
  }
}
