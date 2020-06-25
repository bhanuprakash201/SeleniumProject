package webDrivers_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nopCommerce {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		driver.findElementByLinkText("Register").click();
		
driver.findElementById("gender-male").click();
driver.findElementById("FirstName").sendKeys("BHANUPRAKASH");
driver.findElementById("LastName").sendKeys("CHINTHA");

WebElement day = driver.findElement(By.name("DateOfBirthDay"));
Select sel_day = new Select(day);
sel_day.selectByIndex(1);

WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
Select sel_month = new Select(month);
sel_month.selectByIndex(6);

WebElement year = driver.findElement(By.name("DateOfBirthYear"));
Select sel_year = new Select(year);
sel_year.selectByValue("1990");
driver.findElementById("Email").sendKeys("bhanuprakash224150@gmail.com");
driver.findElementById("Company").sendKeys("DevelpYou Technologies");
driver.findElementById("Password").sendKeys("bhanu201");
driver.findElementById("ConfirmPassword").sendKeys("bhanu201");
driver.findElementById("register-button").click();




	}

}
