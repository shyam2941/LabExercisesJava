package lab1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n = sc.nextInt();
		
		Exercise5 obj = new Exercise5();
		System.out.println(obj.calculateSum(n));
		
	}
	
	int calculateSum(int n) {
		
		int sum = 0;
		for(int i=2;i<=n;i++) {
			if((i%3==0)||(i%5==0)) {
				sum = sum + i;
			}
			
		}
		return sum;
	}
}
