package TestNGPack;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DataProviderEx {

		WebDriver driver = null;

	    @BeforeClass
	    public void LaunchApp(){    
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\91770\\eclipse-workspace\\chromedriver.exe");
			driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://google.com");
	    }
	    
	    @AfterClass
	    public void closeApp(){    
	    	driver.quit();
	    }

	    @Test(dataProvider="readdata")
	    public void TC_GoogleSearch(String user, String searchKey) throws InterruptedException 
	    {          
	            WebElement searchText = driver.findElement(By.name("q"));	  

	            searchText.sendKeys(searchKey);         
	            Thread.sleep(3000);
	            String testValue = searchText.getAttribute("value"); // get value from text box
	            searchText.clear(); 
	          
	            Assert.assertTrue(testValue.contentEquals(searchKey));            
	    }

	    @DataProvider(name="readdata")
	    public Object[][] getDataFromDataprovider()
	    {
	        return new Object[][] {

	                {"user1", "India"},

	                {"user2", "USA"},
	                
	                {"user3", "UK"}
	            };
	    }
	    
	}

