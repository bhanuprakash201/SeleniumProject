package modularCoding;


public class Driver extends TestCases {
	
	public static void main(String[] args) throws InterruptedException {
		TC01_ApplyLeave_VerifyInMyLeavePage();
		tbl_getRowCount("//*[@id=\"resultTable\"]/tbody/tr");
		tbl_getColCount("//*[@id=\"resultTable\"]/thead/tr/th");
		//TC02_ApproveLeave();
	}
	
}

