package TestNGPack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2 {

	@BeforeTest
	public void bt() {
		System.out.println("Before Test method executed");
	}
	
	@BeforeSuite
	public void as() {
		System.out.println("Before Suite method executed");
	}
	
	@Test()
	public void TC03() {
		System.out.println("TC03 completed");
	}	
	
	
}

