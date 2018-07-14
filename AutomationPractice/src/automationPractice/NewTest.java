package automationPractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1,description="This is sample test")
  public void Helloword() 
  {
  
	  System.out.println("Hello World");
	  AssertJUnit.assertEquals(12,13);
	  
  }
  @Test(priority=2,description="Login in to facebook using Chrome")
  public void Facebook_Login_Chrome()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\Personal\\Resources\\Selenium Add On\\chromedriver_win32V2.37\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("sample"); // first name
		//driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("sample"); // first name
		driver.findElement(By.name("lastname")).sendKeys("project"); //last name
		//driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys(("aabbcc@gmail.com")); //email
		//driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).sendKeys(("Abcd#1234")); //password
		driver.findElement(By.name("reg_email__")).sendKeys(("aa2bb2cc2@gmail.com")); //email
		driver.findElement(By.name("reg_passwd__")).sendKeys(("Abcd#1234")); //password
		
		Select sel1 = new Select(driver.findElement((By.xpath("//*[@id=\"month\"]")))); //Month
		sel1.selectByIndex(12);
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		sel2.selectByValue("30");
		Select sel3 = new Select(driver.findElement((By.xpath("//*[@id=\"year\"]")))); // year
		sel3.selectByVisibleText("1983");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='1' and @name='sex']")).click();
		
		//driver.findElement((By.id("u_0_4"))).click(); // radio gender female
		boolean bool1 = false;
		bool1 = driver.findElement(By.name("reg_email_confirmation__")).isDisplayed();
		System.out.println(bool1);
		if (bool1 == true ) // to check 're-type email' 
				{
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aa2bb2cc2@gmail.com");
				}
		bool1 = false;
		bool1 = driver.findElement(By.xpath("//*[@id=\"u_0_z\"]")).isDisplayed();
		if (bool1 == true)  //to check Submit or Create Account
		{
			driver.findElement(By.xpath("//*[@id=\"u_0_z\"]")).click(); // Create Account button
		}
		
		else
		{
			driver.findElement(By.xpath("//*[@id=\"u_0_10\"]")).click(); //Submit button
		}
		//driver.quit();
  }
}
