package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/ChromeDriver");

		WebDriver browser = new ChromeDriver();
		browser.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select Country = new Select(browser.findElement (By.name("country")));
		
		Country.selectByVisibleText("USA");
	
		
		
		Select Skill = new Select(browser.findElement(By.name("skill")));
		
		Skill.selectByVisibleText("Programming");
		Thread.sleep(5000);
		
		browser.findElement(By.name("submit")).click();
		Thread.sleep(5000);
	
		
		
		
	}

}
