package PP1;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
//import com.google.common.base.Functions;

public class Class2 {
	WebDriver driver;
@Test
public void M5(){
	driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	/*List<WebElement> li=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li[1]/ul/li/ul/li[1]/ul/li/a/span[1]"));
for(WebElement h:li)
{
	System.out.println("value======"+h.getText());
	
}
*/
	//WebElement ele=driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]"));
	//WebDriverWait w=new WebDriverWait(driver,10);
	//w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//span[contains(text(),'Electronics')]")));
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.MINUTES).pollingEvery(2, TimeUnit.MINUTES).ignoring(NoSuchElementException.class);


	
	WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver) {
			WebElement ele34=driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]"));
			
			
			return driver.findElement(By.xpath(".//span[contains(text(),'Electronics')]"));}});
	
	List <WebElement> ll=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li[1]/ul/li/ul/li[1]/ul/li/a"));
	
	//System.out.println("Testrtr======"+s);
	
	for(WebElement el: ll)
	{
		String s=el.getAttribute("Title");
		System.out.println(s);
		
	}
}
}
