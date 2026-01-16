package basics;

import java.util.Scanner;

public class age {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age <= 13) {
			System.out.println("child");
		}else if(age<=20) {
			System.out.println("Teen");
			
		}else if(age<=60) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior");
		}
		
		
		sc.close();
		
	}

}
