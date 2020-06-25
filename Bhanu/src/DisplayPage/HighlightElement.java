package DisplayPage;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HighlightElement {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
			driver.get("http://testingmasters.com/hrm/");
			
			 Thread.sleep(8000);
			 
			WebElement un = driver.findElement(By.id("txtUsername"));		
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			   for (int iCnt=0; iCnt<10; iCnt++) 
			   {
			         js.executeScript("arguments[0].style.border='solid 10px red'", un);
			         Thread.sleep(200);
			         js.executeScript("arguments[0].style.border=''", un);
			         Thread.sleep(200);
			   }
		}

	}


