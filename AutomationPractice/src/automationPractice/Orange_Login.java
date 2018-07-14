package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orange_Login {

	public static void Orange_login() {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();

driver.get("http://opensource.demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin");
driver.findElement(By.id("btnLogin")).click();
	}

}
