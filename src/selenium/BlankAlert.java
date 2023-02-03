package selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/nusratjahan/Downloads/chromedriver");
		
		WebDriver browser = new ChromeDriver();
		// TODO Auto-generated method stub
		browser.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		browser.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		Alert alert = browser.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		Thread.sleep(5000);
		
		
		
	
		
		
		
	    
		
		
		
		
		
		
		
		

	}

}
