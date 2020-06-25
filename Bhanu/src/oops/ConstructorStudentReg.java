package oops;

public class ConstructorStudentReg {
	
	//Here we are Saving Student Reg Details 
	
	String name;	
	int id;
	static String schoolname;
	
	//default constructor
	ConstructorStudentReg(){
		this.name = null;
		this.id = 0;
	}	
	
	ConstructorStudentReg(String name, int id){
		this.name = name;
		this.id = id;
	}	
	
	void insert(){		
		System.out.println("insert student data to database");		
	}
	
	void edit() {		
		System.out.println("edit/update student data to database");
	}
	
	void delete() {
		System.out.println("delete student data from database");		
	}
	
	public static void main(String[] args) {
		ConstructorStudentReg st1 = new ConstructorStudentReg("Bhanu",30);		
		ConstructorStudentReg st2 = new ConstructorStudentReg("Naresh", 10);
		
		System.out.println(st1.name);
		System.out.println(st2.name);

		System.out.println(st1.id);
		System.out.println(st2.id);
		st1.insert();
		
	}

	

}
