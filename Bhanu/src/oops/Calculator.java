package oops;

public class Calculator {
	
	int a;
	int b;
	
	private void add()
	{
	
	int c;
	c=a+b;
	System.out.println("Sum"+c);

}
	private void sub()
	{
	
	int c;
	c=a-b;
	System.out.println("sub"+c);

}
	
	public static void main(String[] args)
	{
	Calculator A=new Calculator();
	A.add();
	A.sub();
	
	
}
}

