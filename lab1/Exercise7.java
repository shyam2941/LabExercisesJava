package lab1;

import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		Exercise7 obj = new Exercise7();
		boolean bln = obj.checkNumber(num);
		//System.out.println(bln);
		if(bln==true)System.out.println(num + " is an increasing number");
		if(bln==false)System.out.println(num + " is not an increasing number");
		
		
		
		
		
		
	}
	
	boolean checkNumber(int num) {
		
		int ld = num%10;
		int tmp = num/10;
		
		boolean b = true;
		while(tmp!=0) {
			if(ld<=tmp%10) {
				b =  false;
				break;
								
			}
			ld = tmp%10;
			tmp = tmp/10;
			
			
		}
		return b;
		
	}

}
