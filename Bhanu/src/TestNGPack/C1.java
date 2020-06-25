package TestNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C1 {
	
	@BeforeClass
	public void bc() {
		System.out.println("Before class completed");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("After class completed");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("Before method completed");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("After method completed");
	}
	
	@Test
	public void TC01() {
		System.out.println("TC01 completed");
	}
	
	@Test
	public void TC02() {
		System.out.println("TC02 completed");
	}

}

