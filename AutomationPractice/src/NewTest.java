

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import javax.servlet.*;

public class NewTest 
{
//test	
	//to check webhook integration
  @Test
  public void f() 
  {
	  //System.setProperty("webdriver.ie.driver", "C:\\Users\\AU0003A7\\eclipse-workspace\\AutomationPractice\\IEDriverServer.exe");
	  System.setProperty("Firefox Browser", "C:\\Users\\AU0003A7\\eclipse-workspace\\AutomationPractice\\geckodriver.exe");
		
	 // WebDriver driver = new InternetExplorerDriver();
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://erp.audiology-solutions.net/SitePages/InforSuite.aspx");
	  driver.manage().timeouts().implicitlyWait(120, TimeUnit.MINUTES);
	  
	  
	  
	  
  }
}
