package testingmasters;

public class Demo {

	public static void main(String[] args) {
		Dog ls=new Dog();
		ls.Color="white";
		ls.breed="bow bow";
		ls.height=2;
		ls.eat();
		
		Dog lr=new Dog();
		lr.Color="black";
		lr.breed="huu huu";
		lr.height=1.78;
		lr.barking();
		
		System.out.println(ls.breed);
		System.out.println(lr.breed);
				

	}

}
