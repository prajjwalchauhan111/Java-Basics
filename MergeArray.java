package Array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int size1=sc.nextInt();
		System.out.print("Enter the size of array2: ");
		int size2=sc.nextInt();
		int arr1[]= new int[size1];
		int arr2[]= new int[size2];
		
		
		int i=0;
		while(i<arr1.length) {
			System.out.println("Enter the Array1 element at index: "+ i);
			arr1[i]=sc.nextInt();
			i++;
		}
		i=0;
		while(i<arr2.length) {
			System.out.println("Enter the Array2 element at index: "+ i);
			arr2[i]=sc.nextInt();
			i++;
		}
		int newarr[]=MergetheArray(arr1,arr2);
		i=0;
		while(i<newarr.length) {
			System.out.print(newarr[i]+ " ");
			i++;
		}
		
		sc.close();
	

	}
	public static int[] MergetheArray(int arr1[], int arr2[]) {
		int size=arr1.length+arr2.length;
		int array[]=new int[size];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length ) {
			if(arr1[i]> arr2[j]) {
				array[k]=arr2[j];
				j++;
			}else {
				array[k]=arr1[i];
				i++;
			}k++;
		
		}
		
		while(i<arr1.length) {
			array[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			array[k]=arr2[j];
			j++;
			k++;
		}
		
		return array;
	}

}
