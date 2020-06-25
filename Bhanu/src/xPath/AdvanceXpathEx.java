package xPath;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class AdvanceXpathEx {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			//Thread.sleep(5000);
			//Actions class-> it is used to handle mouse operations like mouse hover, right click, double click, drang and drop, etc..
			Actions act = new Actions(driver);
			WebElement leave = driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']"));
			act.moveToElement(leave).build().perform();
			
			driver.findElement(By.xpath("//a[text()='My Leave']")).click();
						
			Thread.sleep(3000);
			
			/*
			 ***HRM Login
				//form/child::input
				//input/ancestor::div
				//html/descendant::input
				//input[@name='_csrf_token']/preceding-sibling::input	
			 */
			
			/*
			//********* preceding example**********
			String ldate = driver.findElement(By.xpath("//*[text()='travelling to home']/preceding::td[6]")).getText();
			System.out.println(ldate);
			*/
			
			/*
			//***** Cancel leave based given leave date with status-Pending Approval
			String sDate = "2020-06-09";
			driver.findElement(By.xpath("//a[text()='"+sDate+"']/parent::td/following::td[5]/a[contains(text(), 'Pending Approval')]/following::td[2]/select/option[text()='Cancel']")).click();
			*/
						
			/*
			//*******get leave reason for given leave date*****
			String sDate = "2020-06-09";
			String txt = driver.findElement(By.xpath("//a[text()='"+sDate+"']/parent::td/following::td[6]")).getText();
			//String txt = driver.findElement(By.xpath("//a[text()='2020-06-09']/parent::td/following::td[6]")).getText();
			System.out.println(txt);		
			*/
			
			//driver.quit();
		}

	}
	//------------------------------------------



