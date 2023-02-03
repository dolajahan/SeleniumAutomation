package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/chromedriver");

		WebDriver browser =new ChromeDriver();
		
		browser.get("http://training.qaonlinetraining.com/testPage.php");
		WebElement checkboxBike =
		browser.findElement(By.xpath("//input[@value='Bike']"));
		Thread.sleep(3000);
		
		browser.findElement(By.xpath("//input[@value='car']")); 
		Thread.sleep(3000);
		WebElement sendbutton =
		browser.findElement(By.xpath("/html/body/form/input[11]"));
		Thread.sleep(3000);
		
		
				
		checkboxBike.click();
		Thread.sleep(5000);
		
		
		sendbutton.click();
		Thread.sleep(5000);
		
		
		
		
		
	}
       

}
