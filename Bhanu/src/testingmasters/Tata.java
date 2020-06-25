package testingmasters;

public class Tata extends BenzInheritance {
	
	public void mirror_autoadjust()
	{
		System.out.println("mirror auto adjustment");
	}
	public void defaultaudio()
	{
		System.out.println("this is default audio system");
	}
	public void powerwindows()
	{
		System.out.println("this is power window");
	}

	public static void main(String[] args)
	{
  
		/*BenzInheritance B1=new BenzInheritance();
		B1.body();
		B1.Engine();
		B1.Manualwindows();
		B1.gears();*/
		
		Tata T1=new Tata();

		T1.mirror_autoadjust();
		T1.defaultaudio();
		T1.powerwindows();
		T1.body();
		T1.Engine();
		T1.Manualwindows();
		T1.gears();
		
		
	}

}
