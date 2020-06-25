package TestNG_HRM;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestCases extends HRM_UserLib {
	public static SoftAssert softassert;

	
		
		@Test
		public static void TC01_ApplyLeave_VerifyInMyLeavePage() throws InterruptedException {
			
			// Step 1: Launch HRM App
			lauchHRM();
					
			// Step 2: Login as a team member
			loginHRM("user02", "TM1234");
					
			// Step 3: Navigate to Apply Leave page
			navApplyLeave();
					
			// Step 4: Enter the details and click on Apply button
			applyLeave("Personal Leave", "2020-06-09", "2020-06-09", "Sick leave");		
					
			// Step 5: Navigate to My Leave page
			navMyLeave();
					
			// Step 6: Verify Leave details are displayed in Leaves result table
			verifyLeaveDetails("Personal Leave", "2020-06-09");
					
			// Step 7: Logout and close Browser
			logout();
			
			softassert.assertAll();
		}
		
		//=========================================================
		@Test(enabled=false)
		public static void TC02_ApproveLeave() throws InterruptedException {
			
			// Step 1: Launch HRM App
			lauchHRM();
							
			// Step 2: Login as a manager
			loginHRM("user03", "TM123");
			
			
			logout();
			
		}

		//=========================================================

	}
	//=================================================================================


