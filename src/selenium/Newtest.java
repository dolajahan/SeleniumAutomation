package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/nusratjahan/Downloads/ChromeDriver" );
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com/");
		
		
		System.out.println(driver.findElement(By.name("username")));
		
		System.out.println(driver.findElement(By.name("password")));
		driver.close();

	}

}