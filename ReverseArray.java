package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[]= new int[size];
		
		
		int i=0;
		while(i<arr.length) {
			System.out.println("Enter the element at index: "+ i);
			arr[i]=sc.nextInt();
			i++;
		}
		ReversetheArray(arr);
		System.out.println("Reversed Array: ");
		i=0;
		while(i<arr.length) {
			
			System.out.print(arr[i]+" ");
			i++;
		}
		sc.close();

}
	
	public static void ReversetheArray(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		i++;
		j--;
		}
		
	}
}