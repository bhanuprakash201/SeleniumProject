package RobotEx;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class UploadFileDemo {

		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://www.testingmasters.com/hrm/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.id("txtUsername")).sendKeys("user02");
			driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
			driver.findElement(By.id("btnLogin")).click();			
			Thread.sleep(3000);
			//Navigate Myinfo page
			driver.findElement(By.id("menu_pim_viewMyDetails")).click();
			
			Thread.sleep(3000);
			
			// Click on Add and then click on Browse
			driver.findElement(By.id("btnAddAttachment")).click();
			
			Actions obj = new Actions(driver);
			WebElement element = driver.findElement(By.id("ufile"));
			obj.moveToElement(element).click().build().perform();
					
			Thread.sleep(3000);
			String filepath = "C:\\Users\\Sandeep\\Desktop\\ForLoad.txt";
			
			StringSelection file = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
			
			Robot robot = new Robot();
			
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(3000);
	        
			/*
			//calling autoit code to select file
			Runtime.getRuntime().exec("C:\\Users\\91770\\Desktop\\FileUploadEx.exe" );
			
			Thread.sleep(12000);
			*/
	        
			//Click on upload
			driver.findElement(By.id("btnSaveAttachment")).click();
		}
	}

