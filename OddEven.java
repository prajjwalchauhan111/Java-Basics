package basics;
import java.util.*;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("zero");
		}else if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		
		sc.close();
	}
	

}
