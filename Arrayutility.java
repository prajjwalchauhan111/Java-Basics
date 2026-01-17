package Array;

import java.util.Scanner;

public class Arrayutility {


	
	
	public static int[] InputArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i=0;
		while(i<size) {
			System.out.println("Enter the element at "+ i +":");
			 arr[i]=sc.nextInt();
			 i++;
	   
			 
		
	
		sc.close();
		 }return arr;
		
		}

}
