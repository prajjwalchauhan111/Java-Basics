package Array;

import java.util.Scanner;

public class search {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		int num = sc.nextInt();
		int[] arr= {23,4,2,55,32,64,7,23,7,22,34};
		boolean isavailable= isAvailable(arr,num);
		if(isavailable) {
			System.out.println("number is available");
		}else {
			System.out.println("number is not available");
		}
		sc.close();
		
	}
	public static boolean isAvailable(int arr[], int num) {
		int index= 0;
		while(index<arr.length) {
			if(arr[index]==num) {
				return true;
			}
			index++;
		}
		return false;
	}

}
