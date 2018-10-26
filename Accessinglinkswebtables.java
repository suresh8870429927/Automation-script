package task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Accessinglinkswebtables {
public WebDriver driver;
private String day;
	//web tables and link
	@Test
	//login page
	public void webtables() throws Exception	
	{
		System.setProperty("webdriver.gecko.driver", "D:\\suresh QA\\automationwork\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://172.18.1.4/vts-admin/Login.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("surv2e11855");
		driver.findElement(By.id("txtPassword")).sendKeys("Temp!123");
		driver.findElement(By.id("btnLogin")).click();
		
		//link text--exact text to get output
		driver.findElement(By.linkText("Staff Quarters")).click();
		Thread.sleep(1000);
		//partial link text--give small prefix of suffix
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		    //Accessing  web tables--find datepicker
		 //This is from date picker table
		List<WebElement> allDateOfDesiredMonth= driver.findElements(By.xpath("ContentPlaceHolderBody_dgvStaffQuarterEmployee_txtHostelCheckInDateTime_0"));
		for(WebElement d:allDateOfDesiredMonth )
		{
			if(d.getText().trim().equals(day))
			{
				d.click();
				break;
			}
}
	/*	
		Thread.sleep(5000);
		int count=ele.size();
		for(int i=0;i<count;i++)
		{	
			String dates=ele.get(i).getText();
			
			
			if(dates.equals("18"))
			{
				
				ele.get(i).click();
				break;
			}
		
		}
		
		*/
		

	}
	}



