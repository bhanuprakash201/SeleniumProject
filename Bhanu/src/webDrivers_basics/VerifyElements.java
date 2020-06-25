package webDrivers_basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		WebElement newsletter = driver.findElement(By.id("Newsletter"));
		
		//isDisplayed -> to verify element is displayed on page(UI)
		if(newsletter.isDisplayed())
			System.out.println("Newsletter checkbox is displayed on Register page");
		else
			System.out.println("Newsletter checkbox is not displayed on Register page");
		
		//isEnabled -> to verify element is enabled
		if(newsletter.isEnabled())
			System.out.println("Newsletter checkbox is enabled");
		else
			System.out.println("Newsletter checkbox is disabled");
		
		//isSelected -> to verify element is selected. Mainly used for Radio button and Check box
		if(newsletter.isSelected())
			System.out.println("Newsletter checkbox is selected");
		else
			System.out.println("Newsletter checkbox is not selected");
		
	
		
		if(driver.findElement(By.id("gender-male")).isSelected())
			System.out.println("Gender Radiobutton is selected");
		else
			System.out.println("Gender Radiobutton is not selected");
			
		
			

	}

}

