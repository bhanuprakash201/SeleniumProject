package TestNGData;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class ParametersDemo {
		
		@Parameters({"URL","userID","password"})
		@Test	
		public void TC01(String url, String uid, String pwd)
		{		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			
			driver.get(url);
			driver.findElement(By.id("txtUsername")).sendKeys(uid);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.name("Submit")).click();
					
			driver.quit();
		}	
	}

