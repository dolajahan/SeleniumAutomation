package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,"/Users/nusratjahan/Downloads/ChromeDriver");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.google.com/");
		

		browser.findElement(By.name("q")). sendKeys ("doll");
		browser.findElement(By.name("btnK")).submit();
		
		browser.navigate().to("https://www.facebook.com/");
		System.out.println("Url name is "+ browser.getTitle()+ "website");
		System.out.println("url is: " + browser.getCurrentUrl());
		
		
		
		
		
		browser.navigate().back();
		
		browser.navigate().to("https://www.google.com/");
		
		WebElement bloglink = browser.findElement(By.linkText("Gmail"));
		
		if (bloglink.isDisplayed()) {
			
			System.out.println("Gmail link is displayed usinglinktext");
			
		}else {System.out.println("Gmail link is not displayed usinglinktex");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
		// TODO Auto-generated method stub

	}

}
