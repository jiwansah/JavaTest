package exception.concept;

import javaTest.Employee;

public class EmployeesExtend extends Employee{

	public static void main(String ...args) {
		
		EmployeesExtend ee = new EmployeesExtend();
		ee.protectedString = "";
		ee.publicString="";
		Employee e = new Employee();
		e.publicString="";
	}
}
