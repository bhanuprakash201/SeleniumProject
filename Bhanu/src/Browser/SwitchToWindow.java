package Browser;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class SwitchToWindow {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.get("https://www.facebook.com/");			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			

			driver.findElement(By.linkText("Data Policy")).click();			 
			
			driver.findElement(By.linkText("Cookie Policy")).click();
			Thread.sleep(3000);
			
			//Get Home page window handle
			String HomepageHandle = driver.getWindowHandle();
			System.out.println(HomepageHandle);
					
			//Get Sub browsers handles
			Set<String> allhandles = driver.getWindowHandles();
			
			for(String wndhandle: allhandles)
			{			
				//Move focus to sub browser
				driver.switchTo().window(wndhandle);
				//String pageURL = driver.getCurrentUrl();
				String windowTitle = driver.getTitle();
				
				if (windowTitle.contains("Cookie Policy"))
				{
					System.out.println("Switched to Cookies policy page");		
					// validate the page and close it
					Thread.sleep(3000);		
					driver.close();//Close Cookie policy window/page
					break; //Exit from for loop
				}					
			}
			//Switch to Home page browser
			driver.switchTo().window(HomepageHandle);
			
			
					
		driver.quit();  //Close all browsers opened through webdriver

		}
	}

