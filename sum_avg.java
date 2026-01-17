package Array;

import java.util.Scanner;

public class sum_avg {

	public static void main(String[] args) {

		//int nums[]=Arrayutility.InputArray();
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int nums[]=new int[size];
		int i=0;
		while(i<size) {
			System.out.println("Enter the element at "+ i +":");
		nums[i]=sc.nextInt();
		i++;
		}
		 AverageSum(nums);
	
		 sc.close();
	}	
	
		public static int  AverageSum(int nums[]) {
		int i=0;
		int sum=0;
		while(i<nums.length) {
			sum=sum+nums[i];
			
			i++;
			
		}System.out.println("Sum of the array elements are: " +sum);
		
		int Average = sum/nums.length;
		
		System.out.println("Average of the array is: " + Average);
		
		return Average;
	
		}
	}