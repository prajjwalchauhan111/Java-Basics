package Array;

import java.util.Scanner;

public class findMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		int i=0;
		while(i<arr.length) {
			System.out.println("Enter the element at index: "+i);
			arr[i]=sc.nextInt();
			i++;
		}
		
		int min=findMin(arr);
		System.out.println("Minimum element of array: "+ min);
		int max=findMax(arr);
		System.out.println("Maximum element of array: "+ max);
		
		
		
		sc.close();
	}
	
	
	
	public static int findMin(int arr[]) {
		int i=0;
		int min=arr[0];
	   
	    while(i<arr.length) {
	    	if(min>arr[i]) {
	    		min=arr[i];}
	    		i++;
	    	
	    
	    } 
		return min;
    	}
	    	public static int findMax(int arr[]) {
	    	int i=0;
	    	int max=arr[0];
	    	while(i<arr.length) {
	    	
	    	if(max<arr[i]) {
	    		max=arr[i];
	    	}
	    		i++;
	    
	    	
	    }	return max;
	}

}
