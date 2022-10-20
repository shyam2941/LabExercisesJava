package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Integer;


public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of integers: ");
		int n = sc.nextInt();
		System.out.println("Enter integers: ");
		int[] iArr = new int[n];
		for(int i=0;i<n;i++) {
			iArr[i] = sc.nextInt();
		}
		
		Exercise5 obj = new Exercise5();
		
		System.out.println("Second smallest in the array: ");
		System.out.println(obj.getSecondSmallest(iArr));
		
		
				
	}
	
	int getSecondSmallest(int[] arr) {
		
		ArrayList<Integer> al = new ArrayList();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
//		System.out.println(al);
		Collections.sort(al);
//		System.out.println("----------sorted--------");
//		System.out.println(al);
		
		return al.get(1).intValue();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
