package Array;

import java.util.Scanner;

public class Sum_average {
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
		int avg=Sum_Average(arr);
		System.out.println("the sum of array is "+ avg);
		
		
		sc.close();
		
}
	public static int Sum_Average(int arr[][]) {
		int sum=0;
		int count=0;
		int i=0;
		while(i<arr.length) {
			int j=0;
			while(j<arr[i].length) {
				sum+=arr[i][j];
				count++;
				j++;
			}
			i++;
			
		}
		int average=sum/count;
		System.out.println("Average is "+average);
		return sum;
		
	}
	
}