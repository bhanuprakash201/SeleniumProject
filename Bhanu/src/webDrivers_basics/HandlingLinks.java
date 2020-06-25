package webDrivers_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
driver.findElementByLinkText("Create a Page").click();
//driver.findElementByPartialLinkText("Create").click();
driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
driver.quit();
	}

}
