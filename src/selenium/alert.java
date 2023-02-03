package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/chromedriver");
		
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://training.qaonlinetraining.com/testPage.php");
		
		
        browser.findElement(By.id("alert")).click();
        
        Alert a = browser.switchTo().alert();
        
        System.out.println(a.getText());
        
        a.accept();
        
        
        browser.findElement(By.id("confirm")).click();
        
        
        Alert confirm = browser.switchTo().alert();
        
        System.out.println(a.getText());
       
        
        confirm.dismiss();
        
        Thread.sleep(5000);
        
        
       
		
		// TODO Auto-generated method stub

	}

}
