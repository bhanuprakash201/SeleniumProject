package webDrivers_basics;

	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	public class CaptureScreenshot {

		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				   	  
		   	 TakesScreenshot ts = (TakesScreenshot) driver;
		   	 File scrFile = ts.getScreenshotAs(OutputType.FILE);
		   	 File trgFile = new File("C:\\Users\\Sandeep\\Desktop\\Selenium Screen Shot\\bhanu.png");
		   	 FileHandler.copy(scrFile, trgFile);
		   	 
		    // FileUtils.copyFile(scrFile, trgFile); -> In old versions

		}
	}
	//========================================
/*
	Set<Cookie> cookiesList =  driver.manage().getCookies();
					
	for(Cookie c : cookiesList) {
		System.out.println(c);
	}		
			
	//delete all cookies
	driver.manage().deleteAllCookies();

	//=======================================

	//To get items from dropdown - method1

	WebElement mon = driver.findElement(By.id("month"));
	List<WebElement> items = mon.findElements(By.tagName("option"));		
			
	System.out.println(items.size());
			
	for(WebElement itm : items)
	{
		String str = itm.getText();
		System.out.println(str);
	}		
		
			
	//To get items from dropdown - method2
	List<WebElement> items1 = driver.findElements(By.xpath("//select[@id='month']/option"));
				
	for(WebElement itm : items1)
	{
		String str = itm.getText();
		System.out.println(str);
	}

}
}
	*/