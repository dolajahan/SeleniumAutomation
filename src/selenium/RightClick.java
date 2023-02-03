package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/ChromeDriver");
		// 2. Initialize WebDriver object through ChromeDriver class.
		WebDriver browser = new ChromeDriver();
		// 3. Open the web page http://swisnl.github.io/jQuery-contextMenu/demo.html
		browser.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(browser);
		
		
		WebElement rightClick = browser.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		
			
			action.contextClick(rightClick).build().perform();
		
	
	}

}
