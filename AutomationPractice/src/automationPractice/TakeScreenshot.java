package automationPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
  @Test
  public void TakeScreenshot1() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https:\\www.google.com.sg");
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  
  try {
	  // now copy the  screenshot to desired location using copyFile //method
	 FileUtils.copyFile(src, new File("C:\\Users\\AU0003A7\\eclipse-workspace\\error.png"));
	 }
	  
	 catch (IOException e)
	  {
	   System.out.println(e.getMessage());
	  
	  }
  }
}
