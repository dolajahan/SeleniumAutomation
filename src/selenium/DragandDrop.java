package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nusratjahan/Downloads/chromedriver");
		
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://jqueryui.com/droppable/");
		
		browser.switchTo().frame(0);
		
		WebElement source = browser.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		
		WebElement target = browser.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		Thread.sleep(5000);
		
		Actions act = new Actions(browser);
		
		act.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(5000);
		
		browser.close();
		
		
		// TODO Auto-generated method stub

	}

}
