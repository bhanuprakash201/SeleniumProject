package testingmasters;

public class OverLoading {
	
	void add(int x,int y)
	{
int res=x+y;
System.out.println("Add of int and int Basic Cal "+res);

}
	void add(int x,double y)    //Method OverLoading
	{
double res=x+y;
System.out.println("Add of int and double Basic Cal "+res);

}
	void add(int x,int y,int z)
	{
int res=x+y+z;
System.out.println("Add of int,int and int Basic Cal "+res);

}
	void mul(int x,int y)
	{
int res=x*y;
System.out.println("Mul of int and int Basic Cal "+res);

		
	}
	
	
}
