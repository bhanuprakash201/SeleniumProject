package webDrivers_basics;

	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class SelectionDateinDifferentMethods {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
					
			//Here we Selected Date of Birth with Index Value on Options Drop Down
			/*
			driver.findElement(By.xpath("//select[@id='day']/option[2]")).click();
			driver.findElement(By.xpath("//select[@id='month']/option[2]")).click();
			driver.findElement(By.xpath("//select[@id='year']/option[5]")).click();
			*/
				//Here we Selected  Date and Month and Year with Text	
			/*
			driver.findElement(By.xpath("//select[@id='day']/option[text()='28']")).click();
			driver.findElement(By.xpath("//select[@id='month']/option[text()='Sept']")).click();
			driver.findElement(By.xpath("//select[@id='year']/option[text()='2011']")).click();
			*/
			//Here Three Arrays are Divided one is Date and One is Month and One more Year//
			//Every Array Split with "-" //
			String bdate = "28-Sept-2020";
			String[] arr = bdate.split("-");		
			
			driver.findElement(By.xpath("//select[@id='day']/option[text()='"+arr[0]+"']")).click();
			driver.findElement(By.xpath("//select[@id='month']/option[text()='"+arr[1]+"']")).click();
			driver.findElement(By.xpath("//select[@id='year']/option[text()='"+arr[2]+"']")).click();

		}
	}
