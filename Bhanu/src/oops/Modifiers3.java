package oops;

public class Modifiers3 extends Modifiers1 {
	
		
		public static void main(String[] args) {
			
			Modifiers1 obj1 = new Modifiers1();
			//obj1.m1(); //-> can't access because it is private method
			//obj1.m2(); //-> can't access because it is default method
			obj1.m3();  
			obj1.m4();
			
			Modifiers3 obj2 = new Modifiers3();
			obj2.m3();
			obj2.m4();		
		}


}
