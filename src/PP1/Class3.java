package PP1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class3 {
	WebDriver driver;
	@Test
	public void M(){
	driver=new FirefoxDriver();
	/*driver.get("https://www.flipkart.com");
	
	WebElement ele=driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]"));
	JavascriptExecutor js=(JavascriptExecutor)driver; 

	  js.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'');", ele);
	  */
	  
	  driver.manage().window().maximize();
	  
	  driver.get("http://www.facebook.com");
	  
	 // Create the  JavascriptExecutor object
	  JavascriptExecutor js=(JavascriptExecutor)driver; 
	  
	 // find element using id attribute
	  WebElement username= driver.findElement(By.id("email"));  
	  
	 // call the executeScript method
	  js.executeScript("arguments[0].style.border='3px solid red'", username);
	
	}
}
