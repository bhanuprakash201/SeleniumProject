package DisplayPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyinfoPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();		
		
		Actions act = new Actions(driver);
		WebElement  Myinfo= driver.findElement(By.id("menu_pim_viewMyDetails"));
		act.moveToElement(Myinfo).build().perform();
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		
		
		if  (driver.findElement(By.xpath("//h1[text()='Personal Details']")).isDisplayed())
		
			System.out.println("Personal Details Page Displayed");
			else
				System.out.println("Page Not Displayed");
		
		
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[2]/a").click();
		
		if  (driver.findElement(By.xpath("//h1[text()='Contact Details']")).isDisplayed())		
		
			System.out.println("Contact Details Page Displayed");
		else
			System.out.println("Page Not Displayed");
		
		
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[3]/a").click();
		
		if  (driver.findElement(By.xpath("//h1[text()='Assigned Emergency Contacts']")).isDisplayed())	
		
			System.out.println("Assigned Emergency Contacts Page Displayed");
		else
			System.out.println("Page Not Displayed");
		
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[4]/a").click();

			
			if  (driver.findElement(By.xpath("//h1[text()='Assigned Dependents']")).isDisplayed())
		
			System.out.println("Assigned Dependents Page Displayed");
			else
				System.out.println("Page Not Displayed");
		
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[5]/a").click();
		if  (driver.findElement(By.xpath("//h1[text()='Assigned Immigration Records']")).isDisplayed())
		
			System.out.println("Assigned Immigration Records Page Displayed");
		else
			System.out.println("Page Not Displayed");
		
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[6]/a").click();

		if  (driver.findElement(By.xpath("//h1[text()='Job']")).isDisplayed())
		
			System.out.println("Job Page Displayed");
		else
			System.out.println("Page Not Displayed");
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[7]/a").click();
		if  (driver.findElement(By.xpath("//h1[text()='Assigned Salary Components']")).isDisplayed())
		
		System.out.println("Assigned Salary Components Page Displayed");
		else
			System.out.println("Page Not Displayed");
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[8]/a").click();
		if  (driver.findElement(By.xpath("//h1[text()='Assigned Supervisors']")).isDisplayed())
		
			System.out.println("Assigned Supervisors Page Displayed");
		else
			System.out.println("Page Not Displayed");
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[9]/a").click();
		if  (driver.findElement(By.xpath("//h1[text()='Work Experience']")).isDisplayed())
		
			System.out.println("Work Experience Page Displayed");
		else
			System.out.println("Page Not Displayed");
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[10]/a").click();
		
		if  (driver.findElement(By.xpath("//h1[text()='Assigned Memberships']")).isDisplayed())
		
			System.out.println("Assigned Memberships Page Displayed");
		else
			System.out.println("Page Not Displayed");


}
	
}
