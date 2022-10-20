package com.cg.eis.exception;

public class lab5Exercie3 {

	public static void main(String[] args) {
		
		double salary = 2000;
		try {
			if (salary<3000) {
				throw new EmployeeException("salary should not be below 3000");
				
			}
		}catch(EmployeeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
