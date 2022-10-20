package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Integer> hm  = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		
		System.out.println("Enter student reg no.  marks:");
		int val;
		int key;
		for(int i=0;i<n;i++) {
			key = sc.nextInt();
			val = sc.nextInt();
			
			hm.put(key, val);
		}
		
//		System.out.println(hm);
		Exercise4 obj = new Exercise4();
		System.out.println(obj.getStudents(hm));
		sc.close();
		
	}
	
	
	HashMap getStudents(HashMap hm) {
		
		int marks;
		String medal;
		
		Set<Entry<Integer,Integer>> setObj = hm.entrySet();
				
		HashMap<Integer,String> fhm  = new HashMap<>();
		
		for(Entry<Integer,Integer> el:setObj) {
			marks = el.getValue();
			if(marks>=90) {
				fhm.put(el.getKey(), "Gold");
			}
			else if((marks>=80)&&(marks<90)) {
				fhm.put(el.getKey(), "Silver");
			}
			else if((marks>=70)&&(marks<80)) {
				fhm.put(el.getKey(), "Bronze");
			}
						
		}
		
		return fhm;
		
	}

}


