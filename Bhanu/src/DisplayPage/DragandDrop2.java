package DisplayPage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDrop2 {

public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		
		/*
		//Explicit wait for draggable element 
		WebDriverWait wait = new WebDriverWait(driver, 20);	 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		*/
		
		Wait fwait = new FluentWait(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		fwait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(src, dst).build().perform();
		act.clickAndHold(src).moveToElement(dst).release().build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
			

	}

}

