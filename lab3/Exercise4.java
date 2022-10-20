package lab3;

public class Exercise4 {

	public static void main(String[] args) {
		
		int num = 45862;
		Exercise4 obj = new Exercise4();
		System.out.println(obj.modifyNumber(num));
	}
	
	int modifyNumber(int number1) {
		
		StringBuffer str = new StringBuffer();
		StringBuffer str2 = new StringBuffer();
		str.append(number1);
		for(int i=0;i<str.length()-1;i++) {
			
			int dif = Math.abs(str.charAt(i)-str.charAt(i+1));
			str2.append(dif);
			
		}
		str2.append(str.charAt(str.length()-1));
		
		return Integer.parseInt(str2.toString());
	}
	
}

