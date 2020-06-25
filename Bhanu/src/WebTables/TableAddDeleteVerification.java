package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAddDeleteVerification {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/)");
			
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();		
		driver.findElement(By.xpath("//a[text()='Qualifications']")).click();	
		Thread.sleep(3000);
		    
		//Adding Education
		String ecode = "B.Tech";
		String pyear = "2011";
		String gpa = "61";
		driver.findElement(By.xpath("//input[@id='addEducation']")).click();
		driver.findElement(By.xpath("//select[@id='education_code']/option[text()='"+ecode+"']")).click();		
		driver.findElement(By.xpath("//input[@id='education_year']")).sendKeys(pyear);
		driver.findElement(By.xpath("//input[@id='education_gpa']")).sendKeys(gpa);
		driver.findElement(By.xpath("//input[@id='btnEducationSave']")).click();		
				
		 //Verify details in the table
		 boolean bTag = false;
		 int rowcount = driver.findElements(By.xpath("//table[@class='table tablesorter']/tbody/tr")).size();     
	     for(int i=1;i<=rowcount-4;i++) {
	    	 String appEcode= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[2]")).getText();
	    	 String appPyear= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[3]")).getText();
	    	 String appGPA= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[4]")).getText();
	    	 
	    	 if ((appEcode.equals(ecode)) && (appPyear.equals(pyear)) && (appGPA.equals(gpa)) )
	    	 {
	    		 bTag = true;    		 
	    		 break;
	    	 }
	     }
	     
	     if(bTag)
	    	 System.out.println("Education details are added");
	     else
	    	 System.out.println("Education details are not added");
	    
	   
	   //Delete record
	     bTag = false;
	     rowcount = driver.findElements(By.xpath("//table[@class='table tablesorter']/tbody/tr")).size();
	     for(int i=1;i<=rowcount-4;i++) {
	    	 String appEcode= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[2]")).getText();
	    	 String appPyear= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[3]")).getText();
	    	 String appGPA= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[4]")).getText();
	    	 
	    	 if ((appEcode.equals(ecode)) && (appPyear.equals(pyear)) && (appGPA.equals(gpa)) )
	    	 {
	    		 driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[1]/input[@class='chkbox']")).click();
	    		 driver.findElement(By.xpath("//input[@id='delEducation']")).click();
	    		 bTag = true;
	    		 Thread.sleep(5000);
	    		 break;   		 
	    	 }
	     }
	     
	     if(bTag)
	    	 System.out.println("selected a record and clicked delete button");
	     else
	    	 System.out.println("Either a record not selected or delete button not clicked");
	     
	     
	     //Verify record deleted
	     bTag = true;
	     rowcount = driver.findElements(By.xpath("//table[@class='table tablesorter']/tbody/tr")).size();
	     for(int i=1;i<=rowcount-4;i++) {
		     String appEcode= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[2]")).getText();
	    	 String appPyear= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[3]")).getText();
	    	 String appGPA= driver.findElement(By.xpath("//table[@class='table tablesorter']/tbody/tr["+i+"]/td[4]")).getText();
	    	 if ((appEcode.equals(ecode)) && (appPyear.equals(pyear)) && (appGPA.equals(gpa)) ) {
	    		bTag = false;
	    		break;
	    	 }    	 
	     }
	     
	     if(bTag)
	    	 System.out.println("Education details are deleted");
	     else
	    	 System.out.println("Education details are not deleted");
		
	}

}

