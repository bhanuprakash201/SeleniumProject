package Browser;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	

public class SwitchTabs {
	
	public static void main(String args[]) throws Exception {	 
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println("First/Main Tab title" + driver.getTitle());
		 Thread.sleep(5000);
		//Open new tab using CTRL + t key.
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  
		//Open URL In 2nd tab.	
		driver.navigate().to("http://yahoo.com");
		System.out.println("Second Tab title" + driver.getTitle());
		  
		//Switching between tabs using CTRL + tab keys.
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		 System.out.println("Title of page after pressing ctrl+tab - " + driver.getTitle());
		 
		 //Switch to current selected tab's content.
		 driver.switchTo().defaultContent();  //Google page is focused
		 System.out.println("Title of default page - " + driver.getTitle());
	  
	 }	

}

