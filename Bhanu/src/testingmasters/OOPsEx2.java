package testingmasters;

public class OOPsEx2 {

	int a;
	int b;

	
	int add(int x,int y)
	{
		int c;
		a=x;
		b=y;
		c=a+b;
		return c;
	}
	void sub()
	{
int c;
c=a-b;
System.out.println("sub  "  + c);
	}
	
	public static void main(String[] args)
	{

OOPsEx2 B=new OOPsEx2();
System.out.println(B.add(60, 110));
int retval=B.add(75, 75);
System.out.println(retval);
}
}

