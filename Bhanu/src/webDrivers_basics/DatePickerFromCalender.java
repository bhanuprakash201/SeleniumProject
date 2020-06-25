package webDrivers_basics;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class DatePickerFromCalender {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
			
			driver.findElement(By.id("txtUsername")).sendKeys("user02");
			driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
			driver.findElement(By.id("btnLogin")).click();
			
			//Actions class-> it is used to handle mouse operations like mouse hover, right click, double click, drang and drop, etc..
			Actions act = new Actions(driver);
			WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
			act.moveToElement(leave).build().perform();
			
			driver.findElement(By.id("menu_leave_applyLeave")).click();
			
			Select sel_lt = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
			sel_lt.selectByVisibleText("Annual Leave");
			
			//from date - date picker from Xpath and text() with TagName  "Option" But I select "*" It Includes all Methods.
			driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
			driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/*[text()='Apr']")).click();
			driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/*[text()='2020']")).click();
			driver.findElement(By.xpath("//a[text()='27']")).click();
				
			//to date - date picker from Xpath and text() with TagName Option
			driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[4]/img")).click();
			driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[text()='Apr']")).click();
			driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[text()='2020']")).click();
			driver.findElement(By.xpath("//a[text()='28']")).click();		
			
			/*
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
			*/
		}
	}

