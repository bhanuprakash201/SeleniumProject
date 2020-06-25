package DisplayPage;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScrollAPage {

		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandeep\\Desktop\\libs\\chromedriver.exe");

			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.selenium.dev");		
			//Here Scrolled the Page by 3000 pixels
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 3000)");

		}
	}
