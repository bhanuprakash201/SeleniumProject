package oops;

public class Modifiers1 {
	
	private void m1() {
		System.out.println("C10 -> m1");
	}
	
	void m2() {
		System.out.println("C10 -> m2");
	}
	
	protected void m3() {
		System.out.println("C10 -> m3");
	}
	
	public void m4() {
		System.out.println("C10 -> m4");
	}
	
	public static void main(String[] args) {
		Modifiers1 obj1 = new Modifiers1();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.m4();


}
}
