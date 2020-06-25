package testingmasters;

public class C1Encapsulation {
	
	void Insert()
	{
		//Insert Query
	}

	public static void main(String[] args) {
	
		Customer C1=new Customer();
		C1.setcname("bhanu");
		C1.setcage(29);
		C1.setacct_num(9052020);
		
		
		System.out.println(C1.getcname());
		System.out.println(C1.getcage());
		System.out.println(C1.getacct_num());
		
		Customer C2=new Customer();
		C2.setcname("pavan");
		C2.setcage(12);
		C2.setacct_num(837409);
		
		
		System.out.println(C2.getcname());
		System.out.println(C2.getcage());
		System.out.println(C2.getacct_num());



	}

}
