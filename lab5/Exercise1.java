package lab5;

public class Exercise1 {

	public static void main(String[] args) throws AgeException{
		
		AgeException exn= new AgeException("Age of a person should be above 15");
		int age = 5;
		
		if(age<15) {
			throw exn;
		}
			
		
	}
}

