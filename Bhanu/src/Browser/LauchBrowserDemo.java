package Browser;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.safari.SafariDriver;

	public class LauchBrowserDemo {

		public static WebDriver driver;
		
		public static void launchApp(String Browser) {
			
			Browser = Browser.trim();
			Browser = Browser.toUpperCase();		
			
			switch(Browser) {
			
				case "CHROME":	
					System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
								driver = new ChromeDriver();
								break;
					
				case "FF":	
					System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
								driver = new FirefoxDriver();
								break;
					
				case "IE": 	
								System.setProperty("webdriver.ie.driver", "C:\\Users\\91770\\eclipse-workspace\\IEDriverServer.exe");
								driver = new InternetExplorerDriver();
								break;
								
				case "EDGE":	
								System.setProperty("webdriver.edge.driver", "C:\\Users\\91770\\eclipse-workspace\\MicrosoftWebDriver.exe");
								//System.setProperty("webdriver.edge.driver", "C:\\Users\\91770\\eclipse-workspace\\msedgedriver.exe");
								driver = new EdgeDriver();
								break;
								
				case "SAFARI": 
								driver = new SafariDriver();
								break;
				/*		Here We have to download Html Driver		
				case "HTML" :	
								driver = new HtmlUnitDriver(); // headless browser, execution speed is high
								break;				*/	
				default :
							System.out.println("Incorrect browser name, try again.");
							break;	
				
			}			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://testingmasters.com/hrm/");		
		}
		
		
		public static void main(String[] args) {		 
			
			launchApp("chrome");		
			
			driver.findElement(By.id("txtUsername")).sendKeys("user02");
			driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
			driver.findElement(By.id("btnLogin")).click();	     
			System.out.println(driver.getTitle());
		}
	}

