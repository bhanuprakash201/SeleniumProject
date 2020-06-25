package webDrivers_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();		
		
		driver.get("https://www.google.com/");
		
		


	}

}
