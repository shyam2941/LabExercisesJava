package lab3;
import java.util.Scanner;
public class Exercise2 {
	
	public static void main(String[] args) {
		
		Exercise2 obj = new Exercise2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.next();
		
		System.out.println(obj.getImage(str));
	}
	
	
	String getImage(String s) {
		
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		//System.out.println("sb:" + sb);
		return sb + " | "+sb.reverse();
		
	}
	
	
	
	
}
