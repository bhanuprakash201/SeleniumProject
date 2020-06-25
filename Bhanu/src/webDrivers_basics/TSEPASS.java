package webDrivers_basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class TSEPASS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://telanganaepass.cgg.gov.in/");

	}

}
