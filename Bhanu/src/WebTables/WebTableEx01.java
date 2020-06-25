package WebTables;

	
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class WebTableEx01 {
		
		public static ChromeDriver driver;
		
		public static void lauchHRM() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
		}
		
		public static void loginHRM(String uid, String pwd) throws InterruptedException {
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uid);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			Thread.sleep(5000);
		}
		
		public static void navMyLeave() {
			Actions act = new Actions(driver);
			WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
			act.moveToElement(leave).build().perform();
			
			driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();		
		}
		
		public static int tbl_getRowCount(String ele_xpath) {		
			List<WebElement> rows = driver.findElements(By.xpath(ele_xpath));
			int rowCount = rows.size();		
			return rowCount;		
		}
		
		
		public static int tbl_getColCount(String ele_xpath) {
			
			List<WebElement> colum = driver.findElements(By.xpath(ele_xpath));
			int ColCount = colum.size();		
			return ColCount;		
		}	
		
		public static String tbl_getcellValue(String ele_xpath) {		
			WebElement cell = driver.findElement(By.xpath(ele_xpath));
			String cellText = cell.getText();		
			return cellText;		
		}
		
		
		public static void main(String[] args) throws InterruptedException {
			
			lauchHRM();
			
			loginHRM("user02", "TM1234");
			
			navMyLeave();
			int r = tbl_getRowCount("//table[@id='resultTable']/tbody/tr");
			System.out.println(r);
			
			
			int c=tbl_getColCount("//*[@id=\"resultTable\"]/thead/tr/th");
			System.out.println(c);
			
			String s = tbl_getcellValue("//table[@id='resultTable']/tbody/tr[3]/td[6]");
			System.out.println(s);		
			
		}
		
		
	}



