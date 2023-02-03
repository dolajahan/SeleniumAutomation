package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.remote.RemoteWebDriver;

public class logintest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/chromedriver");
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browser = new ChromeDriver();
		// 3. Open login page of https://admin-demo.nopcommerce.com/login
	        browser.get("https://admin-demo.nopcommerce.com/login");
	       browser.findElement(By.id("Email")).clear();
	       browser.findElement(By.id("Password")).clear();
	       browser.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	       
	       WebElement button=browser.findElement(By.className("button-1"));
	       button.submit();
	       
	       
	     
	            
	       
	   
	        
		// TODO Auto-generated method stub

	}

}
