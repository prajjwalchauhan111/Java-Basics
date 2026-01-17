package Array;

import java.util.Scanner;

public class sumofDiagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the rows of array: ");
		int rows=sc.nextInt();
		System.out.print("Enter the cols of array: ");
		int cols=sc.nextInt();
		int arr[][]= new int[rows][cols];
		
		
		int i=0;
		
		while(i<rows) {
			int j=0;
			while(j<cols) {
				System.out.println("Enter the Array element: " );
				arr[i][j]=sc.nextInt();
				j++;
			}
			i++;
			
			
			
}
		sumdiaogonal(arr);
		
		sc.close();

}
	public static void sumdiaogonal(int arr[][]) {
		if (arr.length != arr[0].length) {
		    System.out.println("Diagonal sum is only possible for square matrices.");
		    return;
		}

	int n=arr.length;
		int leftsum=0;
		int rightsum=0;
		int i=0;
		while(i<n) {
			leftsum+=arr[i][i];
			rightsum+=arr[i][n-1-i];
			i++;
		}
		int sum=leftsum+rightsum;
		
		    sum -= arr[n / 2][n / 2];
		

		
		System.out.println("sum of the diagonal "+ sum);
		
	}
}