package webDrivers_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopCommerceLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		driver.findElementByLinkText("Log in").click();
		driver.findElementById("Email").sendKeys("bhanuprakash224150@gmail.com");
		driver.findElementById("Password").sendKeys("bhanu201");
		
		//tagname[@attribute = 'attributevalue']
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

}
