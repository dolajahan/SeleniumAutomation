package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newdemo {

	public static void main(String[] args) {
		
		 WebDriver browserObject;
		  
		    System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/chromedriver");
			
		 

			 browserObject = new ChromeDriver();
		  
		    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		    
		
		    browserObject.findElement(By.name("name")).sendKeys("DemoName");
		 
		    browserObject.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
		    
		   
		    browserObject.findElement(By.name("website")).sendKeys("www.demosite.com");
		    
		    
		    browserObject.findElement(By.name("comment")).sendKeys("demo comment");
		
	}

}
