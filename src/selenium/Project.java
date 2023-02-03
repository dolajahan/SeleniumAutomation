package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/chromedriver");
		
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://practice.automationtesting.in/");
		
		
		browser.findElement(By.xpath("//*[@id=\"menu-item-40\"]/a")).click();
		// TODO Auto-generated method stub
		Thread.sleep(5000);
	
		// click on Home
		browser.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
		
		System.out.println("homepage is having three sliders.");
		
		Thread.sleep(5000);
		browser.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li/a[1]/img")).click();
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//*[@id=\"content\"]/nav/a")).click();
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//*[@id=\"text-22-sub_row_1-0-2-1-0\"]/div/ul/li/a[1]/img")).click();
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//*[@id=\"product-163\"]/div[3]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		
		browser.findElement(By.xpath("//*[@id=\"product-165\"]/div[2]/form/button")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		
	}
	
	

}
