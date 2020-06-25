package seleniumpractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Ritesapplication {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://powergrid.com/");
driver.manage().window().maximize();
driver.findElement(By.className("menu__link")).click();
driver.findElement(By.className("CwaK9")).click();
driver.findElement(By.className("AxOyFc snByac")).sendKeys();
driver.findElement(By.className("RveJvd snByac")).click();

}
}