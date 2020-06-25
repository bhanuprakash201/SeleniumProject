package testingmasters;

public class OOPSEX1 {
	
	int a;
	int b;

	
	void add(int x,int y)
	{
		int c;
		a=x;
		b=y;
		c=a+b;
		System.out.println("add  "  + c);
	}
	void sub()
	{
int c;
c=a-b;
System.out.println("sub  "  + c);
	}
	
	public static void main(String[] args)
	{

OOPSEX1 A=new OOPSEX1();
A.sub();
A.add(50,100);
A.sub();
}
}
