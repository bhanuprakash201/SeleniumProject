package testingmasters;

public class ArrayExample {

	public static void main(String[] args) {
	String[] Names=new String[5];
			Names[0]="Bhanu";
	        Names[1]="sam";
	        Names[2]="Varsha";
	        Names[3]="Pavan";
	        Names[4]="Rajitha";
	        
	        System.out.println(Names[0]);
	        System.out.println(Names[1]);
	        
	        int n=Names.length;
	        
	        System.out.println(n);
	        
	        for(int i=0;i<Names.length;i++)
	        {

	System.out.println(Names[i]);

	}

}
}
