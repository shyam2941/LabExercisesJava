package lab1;

import java.util.Scanner;

public class exercise2 {
	
	public static void main(String[] args) {
		
		System.out.println("Select a color:red/yellow/green");
		Scanner sc = new Scanner(System.in);
		String lgt = sc.next();
		
		switch(lgt) {
		
		case "red":
			System.out.println("stop");
			break;
			
		case "yellow":
			System.out.println("ready");
			break;
			
		case "green":
			System.out.println("go");
			break;
		}
					
			
	}

}
