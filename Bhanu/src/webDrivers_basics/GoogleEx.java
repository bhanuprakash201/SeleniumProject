package webDrivers_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();		
		
		driver.get("https://www.google.com/");
		
		String actTitle = driver.getTitle();
		
		String expTitle = "Google";
		
		if(actTitle.equals(expTitle))
			System.out.println("Google page displayed, passed");
		else
			System.out.println("Google page not displayed, failed");		
		

		
		

	}

}
