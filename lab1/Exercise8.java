package lab1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n = sc.nextInt();
		Exercise8 obj = new Exercise8();
		boolean bln = obj.checkNumber(n);
		//System.out.println(bln);
		if(bln==true)System.out.println(n + " is a power of two");
		if(bln==false)System.out.println(n + " is not a power of two");
		
		sc.close();
	}
	boolean checkNumber(int n) {
		boolean b = false;
		while(n%2==0) {
			n=n/2;
			if(n==1)
				b = true;
		}
		return b;
	}
	
}
