package testingmasters;

public class ArrayTwoDimensionMultiplication {
	
	public static void main(String[] args) {
		
		int[][] arr1= {  {10,20},{40,50}  };
		int[][] arr2= {  {5,10},{10,15}   };
		int arr3[][]=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				
				arr3[i][j]=arr1[i][k]*arr2[k][j];
				
				System.out.print(arr3[i][j]+" ");
				
		}
			System.out.println();

	}

}
}

