package testingmasters;

	import java.util.Scanner;
	
	public class ArrayReversingNumber {
		
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);

				System.out.println("Enter Array Size");
				int n=sc.nextInt();
				int[] Num=new int[n];


				System.out.println("Enter Your Numbers");
				for(int i=0;i<=Num.length-1;i++)
				{
				Num[i]=sc.nextInt();
					}
				System.out.println(" Now Diplaying Numbers Reverse ");
				for (int i=Num.length-1;i>=0;i--)
				{
						
					System.out.println(Num[i]);
				}
					}
				}



