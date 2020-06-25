package PracticeProrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KCRAmount
{	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://epos.telangana.gov.in/ePoS/login.html");
		driver.findElementByPartialLinkText("DBT Response").click();
		
		WebElement month = driver.findElement(By.name("month"));
		Select sel_month = new Select(month);
		sel_month.selectByIndex(5);
		
		WebElement year = driver.findElement(By.name("year"));
		Select sel_year = new Select(year);
		sel_year.selectByVisibleText("2020");
		
		driver.findElementById("rum_id").sendKeys("369350033743");
		
		driver.findElementById("txtCaptcha");
		
		driver.quit();
		
}
}