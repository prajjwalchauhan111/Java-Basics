package Array;

import java.util.Scanner;

public class Palindrome {

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
		boolean ispalindrome=isPalindrome(arr);
		if(ispalindrome) {
			System.out.println("Array is a palindrome");
		}else {
			System.out.println("Array is not a palindrome");
		}
		  
		
		sc.close();

	}
	public static boolean isPalindrome(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return false;
			}i++;
			j--;
		}
		
		return true;
	}

}
