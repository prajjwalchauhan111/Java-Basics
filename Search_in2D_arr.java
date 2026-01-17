package Array;

import java.util.Scanner;

public class Search_in2D_arr {
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
		System.out.print("Enter the element want to search:");
		int target=sc.nextInt();
		boolean isFound=Search(arr,target);
		if(isFound) {
			System.out.println("element is found");
			
		}else {
			System.out.println("element is not found");
			
		}  
		sc.close();

} 
	public static boolean Search(int[][] arr, int target){
		int i=0;
	
		while(i<arr.length) {
			int j=0;
			while(j<arr[i].length) {
				if(arr[i][j]==target) {
					//System.out.println("element is found at index"+ i , j);
					return true;
				}j++;
			}i++;
			
		}
		
		return false;
	}
	}