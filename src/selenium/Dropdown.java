package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/ChromeDriver");
		ChromeDriver browser =new ChromeDriver();
		
		browser.get("http://training.qaonlinetraining.com/testPage.php");
		
		browser.findElement(By.name("name")).sendKeys("dola");
		browser.findElement(By.name("email")).sendKeys("nusrat.dola@gmail.com");
		
		browser.findElement(By.name("website")).sendKeys("www.google.com");
		browser.findElement(By.name("comment")).sendKeys("I am bangali");
		browser.findElement(By.name("submit")).click();
		
		
		browser.close();
		
		
		// TODO Auto-generated method stub

	}

}