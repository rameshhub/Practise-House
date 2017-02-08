package PP1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Class1 {
	WebDriver driver;
	@BeforeMethod
	public void M1(){
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		WebDriver.Options ss =driver.manage();
		WebDriver.Window kk=ss.window();
		kk.maximize();
	}
//@Test(priority=2,dependsOnMethods={"M5"})
	
@Test(groups={"ab"})
public void M2(){
	WebElement ele=driver.findElement(By.xpath("//span[contains(text(), 'Electronics')]"));
	
	Actions ac=new Actions(driver);
	ac.moveToElement(ele).perform();
	
}
//@Test(priority=1,dependsOnMethods={"M5"})

@Test(groups={"ab"})
public void M4(){
	
	WebElement ele=driver.findElement(By.xpath("//span[contains(text(), 'Appliances')]"));
	Actions ac=new Actions(driver);
	ac.moveToElement(ele).perform();
}
//@Test(priority=1)


@Test()
public void M5(){
	
	WebElement ele=driver.findElement(By.xpath("//span[contains(text(), 'Men')]"));
	Actions ac=new Actions(driver);
	ac.moveToElement(ele).perform();
}


@AfterMethod
public void M3(){
	driver.quit();
}
}
