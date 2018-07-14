package automationPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtendReport 
{
	ExtentReports extent;
	ExtentTest	Logger;
	@BeforeTest
	
  @Test
  public void Extend_Report() 
  {
		extent = new ExtentReports();
		Logger = extent.createTest("Verify Links");
	
	  
  }
}
