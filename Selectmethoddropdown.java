package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selectmethoddropdown {
public WebDriver driver;
	@Test
	//login page
	public void selectmethod() throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "D:\\suresh QA\\automationwork\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    driver.get("http://172.18.1.4/vts-admin/Login.aspx");
    driver.findElement(By.id("txtUserName")).sendKeys("surv2e11855");
    driver.findElement(By.id("txtPassword")).sendKeys("Temp!123");
    driver.findElement(By.id("btnLogin")).click();
    
    //cab request
    driver.findElement(By.id("aCabRequest")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("aCabRequestRaise")).click();
 
    Thread.sleep(10000);
    //1....select dropdown using-----selectvisibletext
    driver.findElement(By.id("ContentPlaceHolderBody_ddlvehicle")).click();
    new Select(driver.findElement(By.id("ContentPlaceHolderBody_ddlvehicle"))).selectByVisibleText("Van");
    
    //2....select dropdown using------selectvisiblebyindex
   // driver.findElement(By.id("ContentPlaceHolderBody_ddlvehicle")).click();
    //new Select(driver.findElement(By.id("ContentPlaceHolderBody_ddlvehicle"))).selectByIndex(2);
    
    //3...select dropdown using -----selectvisiblebyvalue
   // driver.findElement(By.id("ContentPlaceHolderBody_ddlvehicle")).click();
    //new Select(driver.findElement(By.id("ContentPlaceHolderBody_ddlvehicle"))).selectByValue("2");
    
	}

}
