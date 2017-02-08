package PP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class4 {
	
	
	
	WebDriver driver;
	
	@BeforeTest
	public void m1(){
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

	}
	@Test
	public void m2(){
		
		
		try {
			
			Actions ac=new Actions(driver);
			
			ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(), 'Men')][1]"))).build().perform();
		
			List <WebElement> ll=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li[1]/ul/li/ul/li[1]/ul/li/a"));
			
	ArrayList<String> al=new ArrayList<String>();
			
			Thread.sleep(3000);
			
			for(int i=0;i<ll.size();i++){
				
				
				
				WebElement a=ll.get(i);
				
				String s=a.getAttribute("Title");
				
				al.add(s);
				
			}
	
			al.add("Samsung");  //added duplicate element
			
			
			Set<String> hs = new HashSet<>();
			hs.addAll(al);
			al.clear();
			al.addAll(hs);
			Collections.sort(al);
			System.out.println(al);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@AfterTest
	public void m3(){
		
		
		driver.close();
	}
	

}
