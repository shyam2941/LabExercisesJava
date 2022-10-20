package lab1;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.println("nth value: ");
		System.out.println(fib(n));
		System.out.println(rfib(n));
		
	}
	
	static int rfib(int n) {
		//int result = 0;
		if(n<=2)
		return 1;
		
		else {
			return rfib(n-1) + rfib(n-2);
		}
	}
	
	static int fib(int n) {
		int a = 1;
		int b = 1;
		int c = 0;
		for (int i=1;i<=n-2;i++) {
			c = a+b;
			a = b;
			b = c;
			
			
		}
		return c;
	}
}
