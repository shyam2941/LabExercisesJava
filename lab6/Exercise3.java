package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter number of integers:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			arr[i] =  sc.nextInt();
		}
		
		Exercise3 obj = new Exercise3();
		System.out.println(obj.getSquares(arr));
		sc.close();
	}
	
	
	Map getSquares(int[] arr) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			hm.put(arr[i], arr[i]*arr[i]);
			
		}
		return hm;
	}
	

}
