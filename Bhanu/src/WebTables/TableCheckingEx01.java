package WebTables;

	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class TableCheckingEx01 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
			
			driver.findElement(By.id("txtUsername")).sendKeys("user02");
			driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
			driver.findElement(By.id("btnLogin")).click();		
			
			Actions act = new Actions(driver);
			WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
			act.moveToElement(leave).build().perform();
					
			//----------- Apply Leave		
			String leaveDate = "2020-05-29";
			String leaveType = "Personal Leave";
			String leavecomment = "sick leave";
			
			driver.findElement(By.id("menu_leave_applyLeave")).click();
					
			Select sel_lt = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
			sel_lt.selectByVisibleText(leaveType);
			
			WebElement fd = driver.findElement(By.id("applyleave_txtFromDate"));
			fd.clear();
			fd.click();
			fd.sendKeys(leaveDate);
			fd.sendKeys(Keys.ESCAPE);
			
			WebElement td = driver.findElement(By.id("applyleave_txtToDate"));
			td.clear();
			td.click();
			td.sendKeys(leaveDate);
			td.sendKeys(Keys.ESCAPE);		
					
			driver.findElement(By.id("applyleave_txtComment")).sendKeys(leavecomment);
			
			driver.findElement(By.id("applyBtn")).click();		
			
			//----------- Cancel a leave which was applied		
			driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
			
			int rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();		
			
			for(int row = 1; row<=rowCount; row++) {			
				String appLeaveDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+row+"]/td[1]")).getText();
				String appLeaveType = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+row+"]/td[3]")).getText();
				String appLeaveStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+row+"]/td[6]")).getText();
				
				if ((appLeaveDate.equals(leaveDate)) && (appLeaveType.equals(leaveType)) && (appLeaveStatus.contains("Pending Approval")) )
				{
					driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+row+"]/td[8]/select/option[text()='Cancel']")).click();
					driver.findElement(By.xpath("//input[@id='btnSave']")).click();
					
					Thread.sleep(5000);
					// verify leave status changed to Cancelled
					appLeaveStatus = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+row+"]/td[6]")).getText();
					if(appLeaveStatus.contains("Cancelled"))
						System.out.println("Leave status changed to Cancelled");
					else
						System.out.println("Leave status not changed to Cancelled, " + appLeaveStatus);					
					
					break;
				}			
			}	
			
			//driver.quit();

		}


}
