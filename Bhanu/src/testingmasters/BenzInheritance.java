package testingmasters;

public class BenzInheritance {
	
	public void body()
	{
		System.out.println("Body");
	}
	public void Engine()
	{
		System.out.println("engine");
	}
	public void Manualwindows()
	{
		System.out.println("Windows");
	}
	public void gears()
	{
		System.out.println("gears");
	}

	public static void main(String[] args) {
		BenzInheritance B1=new BenzInheritance();
		B1.body();
		B1.Engine();
		B1.Manualwindows();
		B1.gears();
	}
	

	}
