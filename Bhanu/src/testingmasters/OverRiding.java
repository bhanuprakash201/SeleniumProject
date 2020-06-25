package testingmasters;

public class OverRiding extends OverLoading {
	
	void add(int x,int y)
	{
		System.out.println("Add of int and int Scientific Calculator " +(x+y));
	}
	void add(double x,double y)
	{
		System.out.println("Add of double and double Scientific Calculator " +(x+y));
	}
	void sub(int x,int y)
	{
		int res=x-y;
		System.out.println("Sub of int and int Scientific Calculator " +res);
	}
	void div(int x,int y)
	{
		double res=x/y;
		System.out.println("Div of int and int in Scientific Calculator "+res);
	}
	void m1()
	{
		add(10,20,20);
		add(30,40);
		super.add(45, 15, 40);   //Methods From parent Class
	}
	
	

	public static void main(String[] args) {
		
		OverRiding obj1=new OverRiding();
		obj1.add(15, 20.1);
		obj1.add(13, 16);
		obj1.m1();
		obj1.div(100, 21);
	

	}

}
