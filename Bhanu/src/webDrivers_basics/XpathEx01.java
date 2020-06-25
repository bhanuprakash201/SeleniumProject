package webDrivers_basics;

	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class XpathEx01 {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.nopcommerce.com/");
			
			//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/a/img")).click();
			
			driver.findElement(By.linkText("Log in")).click();
			
			//tagname[@attribute = 'attributevalue']
			
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test@gmail.com");
		}

	}

