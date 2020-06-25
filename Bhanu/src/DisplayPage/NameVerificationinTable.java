package DisplayPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NameVerificationinTable {
	
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
	
		
		String Name = "Gowtham";
		String Relation = "Child";
		String DOB = "2019-04-01";
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		driver.findElementByXPath("//*[@id=\"sidenav\"]/li[4]/a").click();
		driver.findElementById("btnAddDependent").click();
		
		driver.findElementByXPath("//*[@id=\"dependent_name\"]").sendKeys(Name);
					
			Select sel_lt = new Select(driver.findElement(By.id("dependent_relationshipType")));
			sel_lt.selectByVisibleText(Relation);
			
			WebElement fd = driver.findElement(By.id("dependent_dateOfBirth"));
			fd.clear();
			fd.click();
			fd.sendKeys(DOB);
			fd.sendKeys(Keys.ESCAPE);
			
			driver.findElementById("btnSaveDependent").click();
			
	
		
		boolean bTag = false;
		 int rowcount = driver.findElementsByXPath("//*[@id=\"dependent_list\"]/tbody/tr").size();
		 System.out.println(rowcount);
	     for(int i=1;i<=rowcount-4;i++) {
	    	 String appName= driver.findElement(By.xpath("//*[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
	    	 String appRelation= driver.findElement(By.xpath("//*[@id='dependent_list']/tbody/tr["+i+"]/td[3]")).getText();
	    	 String appDOB= driver.findElement(By.xpath("//*[@id='dependent_list']/tbody/tr["+i+"]/td[4]")).getText();
	    	 
	    	 if ((appName.equals(Name)) && (appRelation.equals("child")) && (appDOB.equals(DOB)) )
	    	 {
	    		 bTag = true;    		 
	    		 break;
	    	 }
	     }
	     
	     if(bTag)
	    	 System.out.println("Education details are added");
	     else
	    	 System.out.println("Education details are not added");
}
}

