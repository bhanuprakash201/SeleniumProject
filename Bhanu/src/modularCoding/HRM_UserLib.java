package modularCoding;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

	public class HRM_UserLib {
		
		public static ChromeDriver driver;      //This is Use in All methods so we Write in Public
		
		
		//This Method launching URL
		public static void lauchHRM() {      //This Method launching URL
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
		}
		//This Method for Entering Login and Password and click on Login with Valid Credentials
		public static void loginHRM(String uid, String pwd) throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uid);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			Thread.sleep(5000);
			boolean bTag = driver.getCurrentUrl().contains("dashboard");
			Assert.assertTrue(bTag, "Home page is not displayed");

		}
		//This Method Cursor move to Leave Module and click on my Leave tab
		public static void navMyLeave() {
			Actions act = new Actions(driver);
			WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
			act.moveToElement(leave).build().perform();
			
			driver.findElement(By.xpath("//a[text()='My Leave']")).click();		
		}
		//This Method is Cursor move to Leave Module and Click on Apply
		public static void navApplyLeave() {
			Actions act = new Actions(driver);
			WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
			act.moveToElement(leave).build().perform();
			
			driver.findElement(By.xpath("//a[text()='Apply']")).click();		
		}
		
		//This Method user will Apply Leave with this Details Leave type,From Date,To Date, comment and Click on Apply Button
		public static void applyLeave(String leaveType, String frmDate, String toDate, String comment) {
			Select sel_lt = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
			sel_lt.selectByVisibleText(leaveType);
			
			WebElement fd = driver.findElement(By.id("applyleave_txtFromDate"));
			fd.clear();
			fd.click();
			fd.sendKeys(frmDate);
			fd.sendKeys(Keys.ESCAPE);
			
			WebElement td = driver.findElement(By.id("applyleave_txtToDate"));
			td.clear();
			td.click();
			td.sendKeys(toDate);
			td.sendKeys(Keys.ESCAPE);
			
			driver.findElement(By.id("applyleave_txtComment")).sendKeys(comment);
			
			driver.findElement(By.id("applyBtn")).click();
		}
		//This Method logout the Application
		public static void logout() {
			driver.quit();		
		}
		//This Method will Count No.of Rows in Table
		public static int tbl_getRowCount(String ele_xpath) {		
			List<WebElement> rows = driver.findElements(By.xpath(ele_xpath));
			int rowCount = rows.size();		
			System.out.println(rowCount);
			return rowCount;
		}	
		//This Method will Count No.of Columns in Table
		public static int tbl_getColCount(String ele_xpath) {		
			List<WebElement> Colums = driver.findElements(By.xpath(ele_xpath));
			int ColumsCount = Colums.size();		
			System.out.println(ColumsCount);
			return ColumsCount;
		}
		//This Method will Get Text or Value on Particular Cell
		public static String tbl_getcellValue(String ele_xpath) {		
			WebElement cell = driver.findElement(By.xpath(ele_xpath));
			String cellText = cell.getText();		
			return cellText;	
		}	
		//This Method Will Verify Leave Displayed or Not
		
		public static void verifyLeaveDetails(String expLeaveType, String expLeaveDate) {
			
			int rowCount = tbl_getRowCount("//table[@id='resultTable']/tbody/tr");
			boolean bTag = false;
			
			for(int iRow=1; iRow<=rowCount; iRow++) {
				String appleaveDate = tbl_getcellValue("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[1]");
				String appleaveType = tbl_getcellValue("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[3]");
				String appleaveStatus = tbl_getcellValue("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]");			
				if( (appleaveDate.equals(expLeaveDate)) && (appleaveType.equals(expLeaveType)) && (appleaveStatus.contains("Pending Approval")))
				{
					bTag = true;
					break;
				}							
			}
			
			if(bTag) 
				System.out.println("Leave details displayed in My Leave Result table, pass");
			else
				System.out.println("Leave details not displayed in My Leave Result table, fail");	
			
			Assert.assertTrue(bTag);
		}
		
		//=========================================
		
	}

