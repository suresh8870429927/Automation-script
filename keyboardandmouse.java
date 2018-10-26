package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class keyboardandmouse {
public WebDriver driver;
	@Test
	public void Keyboardandmouse()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\suresh QA\\automationwork\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://172.18.1.4/vts-admin/Login.aspx");
		//log in action event done with mouse click
		WebElement ele=driver.findElement(By.id("txtUserName"));
		//mouse hover click functionallity and keyboard functionallity
		Actions act=new Actions(driver);
		//Actions actionss=act.moveToElement(ele);
	
		act.keyDown(ele,Keys.SHIFT);
		act.sendKeys("suresh");
		act.keyUp(ele,Keys.SHIFT);
		act.doubleClick(ele);
		act.contextClick(ele);
		act.perform();
				
	}

	}


