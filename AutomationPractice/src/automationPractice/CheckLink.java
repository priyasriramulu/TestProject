package automationPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import automationPractice.Reusables.VerifyPageLinks;
//test
public class CheckLink extends VerifyPageLinks
{
  @Test (description= "to test the links in the page")
  public void CheckPageLinks() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https:\\www.google.com.sg");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println("total links are "+links.size());
	  GetPageLinks (links);
  }

private void GetPageLinks(List<WebElement> links) 
{
	// TODO Auto-generated method stub
	for(int i=0;i<links.size();i++)
	{
		WebElement ele = links.get(i);
		String url = ele.getAttribute("href");
		VerifyPageLink(url);
		
		
	}
	
}


}
