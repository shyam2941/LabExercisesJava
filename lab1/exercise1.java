package lab1;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		System.out.println(sumOfCubes(num));
		
	}
	static int sumOfCubes(int num) {
		int sum = 0;
		int ld;
		while(num!=0) {
			ld = num%10;
			//sum = (int) (sum + Math.pow(ld,3));
			sum = sum + ld*ld*ld;
			num = num/10;
		}
		return sum;
	}
}
