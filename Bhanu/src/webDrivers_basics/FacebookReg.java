package webDrivers_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			//WebElement fn = driver.findElement(By.name("firstname"));		
			//fn.sendKeys("DevelopYou");		 // Or use below code
			driver.findElement(By.name("firstname")).sendKeys("bhanuprakash");
			
			driver.findElement(By.name("lastname")).sendKeys("chintha");
			driver.findElement(By.name("reg_email__")).sendKeys("bhanuprakash224150@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("bhanuprakash224150@gmail.com");

		
			driver.findElement(By.name("reg_passwd__")).sendKeys("bhanu201");
			
			//Day dropdown
			
			WebElement day = driver.findElement(By.name("birthday_day"));
			Select sel_day = new Select(day);
			sel_day.selectByVisibleText("1");
			
			//Month dropdown
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select sel_month = new Select(month);
			sel_month.selectByVisibleText("Jun");
			//sel_month.selectByIndex(2);             this is selecting by index 2 means March, start From 0
			//sel_month.selectByValue("2");           this is Selecting by Value Here FB 2 Means Feb

			
			//Year dropdown
			WebElement year = driver.findElement(By.name("birthday_year"));
			Select sel_year = new Select(year);
			sel_year.selectByVisibleText("1990");
			
			
			
			driver.findElement(By.id("u_0_7")).click();
			
			//driver.findElement(By.name("websubmit")).click();
			

		}

	}
