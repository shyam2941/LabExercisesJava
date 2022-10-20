package lab1;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			for (int j=2;j<=i;j++) {
				
				if((i%j==0)&&(i!=j)){
					break;
				}
				else if ((i%j==0)&&(i==j))
					System.out.println(i);
			}
			sc.close();
		} 
	}
}
