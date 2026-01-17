package Array;

import java.util.Scanner;

public class deleteElement {
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
		System.out.println("Enter the element to be deleted: ");
		int target=sc.nextInt();
		
		int array[]=deletetheElement(arr,target);
		int j=0;
		System.out.println("New Array after deleting element: ");
		while(j<array.length) {
			System.out.print( array[j]+" ");
			j++;
		}
		sc.close();
		
		
		
	}
	
	public static int[] deletetheElement(int arr[], int target) {
		
		
		int i=0,j=0;
		int occ=0;
		while(i<arr.length) {
			if(arr[i]==target) {
				occ++;
			}
			i++;
			
		}if(occ==0) {
			return arr;
		}
		int newsize=arr.length - occ;
		int newArr[]=new int[newsize];
	
		 i=0;
		while(i<arr.length) {
		if(arr[i]!= target) {
			newArr[j]=arr[i];
			j++;
			
		}
		i++; 
		}
		return newArr;
	}

}
