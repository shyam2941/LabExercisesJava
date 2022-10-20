package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
		int[] arr = {1,3,5,5,6,6,3,4,2,7,7,7,2,8,8,8,8};
		Arrays.sort(arr);
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
		Exercise4 obj = new Exercise4();
		int [] fArr = obj.modifyArray(arr);
		System.out.println("Sorted unique array:");
		for(int i:fArr) {
			System.out.println(i);
		}
	}
	
	int[] modifyArray(int[] arr) {
		
		//System.out.println(arr.length);
		int[] uTmp = new int[arr.length];
		int count = 0;
		for(int i=0;i<arr.length-1;i++) {
			
				if(arr[i]!=arr[i+1]) {
					uTmp[count] = arr[i];
					//System.out.println(arr[i]);
					count++;
					//System.out.println(count);
				}
		}
		uTmp[count] = arr[arr.length-1];
		int[] uArr = new int[count+1];
		for(int i=0;i<count+1;i++) {
			uArr[i] = uTmp[i];
		}
		int[] fArr = new int[count+1];
		for (int j=0; j<count+1;j++) {
			fArr[j] = uArr[count-j];
		}
		return fArr;
	}
	
	
}
