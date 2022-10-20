package lab2;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		String[] strArr = new String[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			strArr[i] = sc.next().toLowerCase();
		}
		
		
		Exercise2 obj = new Exercise2();
		String[] sortedArr = obj.sortStrings(strArr);
		for(String s:sortedArr) {
			System.out.println(s);
		}
		
		
		
	}
	
	String[] sortStrings(String[] arr) {
		
		String s1,s2,tmp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				s1 = arr[i];
				s2 = arr[j];
				if(s1.compareTo(s2)>0) {
					tmp = s2;
					arr[j] = s1;
					arr[i] = tmp;
				}
			}
		}
		
		String[] sArr = new String[arr.length];
		if(arr.length%2==0) {
			for(int i=0;i<arr.length/2;i++) {
				sArr[i]=arr[i].toUpperCase();
			}
			for(int j=arr.length/2;j<arr.length;j++) {
				sArr[j]=arr[j].toLowerCase();
			}
			
		}
		else {
			for(int i=0;i<arr.length/2+1;i++) {
				sArr[i]=arr[i].toUpperCase();
			}
			for(int j=arr.length/2+1;j<arr.length;j++) {
				sArr[j]=arr[j].toLowerCase();
			}

		}
		
		
		
		return sArr;
		
	}
	
	
	
	
}
