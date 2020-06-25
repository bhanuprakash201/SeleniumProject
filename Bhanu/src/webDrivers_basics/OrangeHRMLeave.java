package webDrivers_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMLeave {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("user02");
		driver.findElement(By.name("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions act=new Actions(driver);
		WebElement leave=driver.findElementById("menu_leave_viewLeaveModule");
		act.moveToElement(leave).build().perform();
		
      
      driver.findElement(By.id("menu_leave_applyLeave")).click();
       
		WebElement LeaveType = driver.findElement(By.id("applyleave_txtLeaveType"));
		Select sel_LeaveType = new Select(LeaveType);
		sel_LeaveType.selectByIndex(2);
		
		
		
		WebElement fd = driver.findElement(By.id("applyleave_txtFromDate"));
		fd.clear();
		fd.click();

		fd.sendKeys("2020-04-25");
		fd.sendKeys(Keys.ESCAPE);
		
		WebElement td = driver.findElement(By.id("applyleave_txtToDate"));
		td.clear();
		td.click();
		td.sendKeys("2020-04-26");
		td.sendKeys(Keys.ESCAPE);
		
		driver.findElement(By.id("applyleave_txtComment")).sendKeys("Travelling to hometown");
		
		driver.findElement(By.id("applyBtn")).click();
		
		driver.quit(); // driver.close();
		

	}

}
