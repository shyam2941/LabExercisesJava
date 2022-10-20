package lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n = sc.nextInt();
		
		Exercise6 obj = new Exercise6();
		obj.calculateDifference (n);
		
		
	}
	
	void calculateDifference (int n) {
		
		int sum = 0;
		int sumSquares = 0;
		
		for (int i=1;i<=n;i++) {
			sum = sum + i;
			sumSquares = sumSquares + (i*i);
		}
		int squaresSum = sum*sum;
		System.out.println("sum of squares:"+ sumSquares);
		System.out.println("Square of sum:"+ squaresSum);
		System.out.println("Difference: "+(sumSquares-squaresSum));
	}

}
