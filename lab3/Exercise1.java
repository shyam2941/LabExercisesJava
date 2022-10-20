package lab3;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of numbers seperated by ',':");
		StringTokenizer str = new StringTokenizer(sc.next()," ,");
		int sum = 0;
		int count = str.countTokens();
		String[] sArr = new String[count];
		for(int i=0;i<count;i++) {
			sArr[i] = str.nextToken();
		}
		System.out.println("Numbers in entered line:");
		for(String s:sArr)
		{
			System.out.println(s);
			sum = sum + Integer.parseInt(s);
		}
		System.out.println("sum = "+sum); 
	}
}
