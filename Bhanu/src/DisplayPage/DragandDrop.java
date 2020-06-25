package DisplayPage;

//import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		driver.findElementByXPath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement src=driver.findElementById("draggable");
		WebElement dst=driver.findElementById("droppable");

		Actions act=new Actions(driver);
		
		//One method to Perform Drag and Drop
		
		act.dragAndDrop(src, dst).build().perform(); 
		
		//Below One More Method.
		//act.clickAndHold(src).moveToElement(dst).release().build().perform();
		//driver.switchTo().defaultContent();
	//	driver.findElementByXPath("//*[@id=\"droppable\"]").click();
		

		
		

	}

}
