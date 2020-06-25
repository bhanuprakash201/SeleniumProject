package testingmasters;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		int[][] arr=new int[2][3];
	arr[0][0]=20;
	arr[0][1]=30;
	arr[0][2]=40;
	
	
	arr[1][0]=20;
	arr[1][1]=20;
	arr[1][2]=20;
	
	System.out.println(arr[0][2]);
	
	for(int i=0;i<=2;i++)
	{

for(int j=0;j<3;j++)
{
	System.out.println(arr[i][j]);
}
	}

}
}
