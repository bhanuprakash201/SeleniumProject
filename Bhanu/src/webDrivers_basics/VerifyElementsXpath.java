package webDrivers_basics;
	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class VerifyElementsXpath {


		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.nopcommerce.com/");
			
			driver.findElement(By.linkText("Register")).click();
			Thread.sleep(2000);
			
			WebElement fn = driver.findElement(By.id("FirstName"));
			String textboxValue = fn.getAttribute("value");
			System.out.println("Default: " + textboxValue);
			
			fn.sendKeys("BHANUPRAKASH");
			textboxValue = fn.getAttribute("value");
			System.out.println("After entering value: " + textboxValue);
			
			textboxValue = fn.getText();
			System.out.println("output in textbox with getText() method is: " + textboxValue);
			
			String el_name = fn.getAttribute("name"); // fn.getAttribute("id");
			System.out.println("Element name: " +el_name);
			
			String tagname = fn.getTagName();
			System.out.println("Element tag: " +tagname);	
			
			String el_text = driver.findElement(By.partialLinkText("Recently viewed")).getText();
			System.out.println("Element text: " + el_text);
			
		}
	}

