package webDrivers_basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("No of Links avaliable on FaceBook Page" +Links.size());
		
		System.out.println("Links of Facebook Registration Page are...");
		for(WebElement Link:Links)
		{
			String LinkTxt=Link.getText();
			System.out.println(LinkTxt);
		}
		
		//Below and above Loops both are Same 
		/*for(int i=0;i<=Links.size();i++)
		{
			
			String linkTxt = Links.get(i).getText();
			System.out.println(linkTxt);

		}*/
		


	}

}
