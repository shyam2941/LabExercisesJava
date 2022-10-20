package lab2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an size of array:");
		int n = sc.nextInt();
		int[] intArr = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			intArr[i] = sc.nextInt();
		}
		
		Exercise1 obj = new Exercise1();
		System.out.println("Second largest element: ");

		System.out.println(obj.getSecondSmallest(intArr));
		
	
		/*for(int i=0;i<n;i++) {
			System.out.println(intArr[i]);
		}*/
				
	}
	int getSecondSmallest(int[] arr) {
		
		int n1,n2,tmp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				n1 = arr[i];
				n2 = arr[j];
				if(n1>n2) {
					tmp = n2;
					arr[j] = n1;
					arr[i] = tmp;
				}
			}
		}
		
		return arr[1];
	
	}
	
}
