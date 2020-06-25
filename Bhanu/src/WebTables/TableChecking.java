package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableChecking {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		
		//Actions class-> it is used to handle mouse operations like mouse hover, right click, double click, drang and drop, etc..
		Actions act = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		act.moveToElement(leave).build().perform();

		driver.findElementByXPath("//*[@id=\"menu_leave_viewMyLeaveList\"]").click();
		
		driver.findElementByXPath("//*[@id=\"calFromDate\"]").clear();
		driver.findElementByXPath("//*[@id=\"calToDate\"]").clear();
		
		driver.findElementByXPath("//*[@id=\"leaveList_chkSearchFilter_checkboxgroup_allcheck\"]").click();
		driver.findElementByXPath("//*[@id=\"leaveList_chkSearchFilter_1\"]").click();
		driver.findElementByXPath("//*[@id=\"btnSearch\"]").click();
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowCount = rows.size();
		
		System.out.println("Row Counts in  Colum"+rowCount);
		
		
		boolean BTag=true;
		for(int row=1;row<=rowCount;row++)
		{
			String cellText=driver.findElementByXPath("//*[@id='resultTable']/tbody/tr["+row+"]/td[6]").getText();
			
			if((cellText.contains("Pending Approval ")))
					
					{
				BTag=false;
				break;
				
					}
		}
		if(BTag)

		{
			System.out.println("pass");
		}
		else
			System.out.println("Fails");
		
}
}
