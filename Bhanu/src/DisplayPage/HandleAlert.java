package DisplayPage;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HandleAlert {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://15.206.92.87:8080/ORS_SIT/");
			driver.findElementByXPath("/html/body/div[2]/div/div[2]/span[1]/a").click();
			driver.findElementByXPath("//*[@id=\"wrapper\"]/div/div/div/div/div/div/div[2]/form/div/div[2]/input").sendKeys("admin");
			driver.findElementByXPath("//*[@id=\"exampleInputPassword\"]").sendKeys("admin@123");
			driver.findElementByXPath("//*[@id=\"wrapper\"]/div/div/div/div/div/div/div[2]/form/div/input").click();
			//driver.findElementByXPath("//*[@id=\"userDropdown\"]/img").click();
			//driver.findElementByXPath("//*[@id=\"content\"]/nav/ul/li[2]/div/a[2]").click();
			
			driver.findElementByXPath("//*[@id=\"accordionSidebar\"]/li[2]/a/span").click();
			driver.findElementByXPath("//*[@id=\"collapseTwo\"]/div/a[1]").click();
			driver.findElementByXPath("//*[@id=\"dataTable\"]/tbody/tr[1]/td[5]/a[2]").click();
			
			
			
			Alert alert = driver.switchTo().alert();
			String msg = alert.getText();
			System.out.println(msg);
			
			alert.accept(); // ok or yes
			//alert.dismiss(); // cancel or No
			
			//Do you want to delete all related Sub Categories & products ?
			
			Thread.sleep(2000);	
			if(msg.equals("Do you want to delete all related Sub Categories & products ?"))
				System.out.println("OK button selected and confirmation message displayed");
			else
				System.out.println("OK button not selected or confirmation message not displayed");
			

		}

	}
