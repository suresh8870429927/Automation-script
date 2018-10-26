package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class findelement {
public WebDriver driver;
	//Findelement and findelements
		@Test
		public void findelementandelements()
		{
			System.setProperty("webdriver.gecko.driver", "D:\\suresh QA\\automationwork\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
			//findelement--example
			//driver.findElement(By.id("male")).click();
			
			//findelements--example1--for single name given to multiple radio button element2
			
					List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
					int count=radio.size();
					for(int i=0;i<count;i++)
					{
						WebElement ele=radio.get(i);
						String value=ele.getAttribute("value");
						if(value.equalsIgnoreCase("PYTHON"))
						{
							ele.click();
						}
					}

	}

}
