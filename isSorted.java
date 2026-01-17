package Array;

import java.util.Scanner;

public class isSorted {

	public static void main(String[] args) {
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
		
		
		boolean issortedAsc=isSortAsc(arr);
		boolean issortedDec=isSortDec(arr);
		if(issortedAsc||issortedDec) {
			System.out.println("array is sorted");
			
		}else {
			System.out.println("array is not sorted");
		}
		
		
		
		
		sc.close();
		
	}
		
		public static boolean isSortAsc(int arr[]) {
			int i=0;
			while(i<arr.length-1) {
				if(arr[i]>arr[i+1]){
					return false;
				}i++;
			}return true;
			
			
		
	}
		
		
		public static boolean isSortDec(int arr[]) {
			int i=1;
			while(i<arr.length) {
				if(arr[i]>arr[i-1]){
					return false;
				}i++;
			}return true;
			
			
		
	}

}
