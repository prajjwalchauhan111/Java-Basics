package Array;

import java.util.Scanner;

public class occurenceofElement {
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	
	int i=0;
	while(i<arr.length) {
		System.out.println("Enter the elemnt at: "+i+ " ");
		arr[i]=sc.nextInt();
		i++;
	}
	System.out.println("Enter the element to find occurence: ");
	int element=sc.nextInt();
	
	int occurence=findOccurence(arr, element);
	System.out.println("Occurence of element is: " + occurence);
	
	
	sc.close();
	
}

public static int findOccurence(int arr[],int element) {
	int i=0;
	int count=0;
	while(i<arr.length) {
		if( arr[i]== element) {
			count++;
		}i++;
		
	}return count;
}


}
