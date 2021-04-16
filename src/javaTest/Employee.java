package javaTest;

public class Employee {

	int empID;
	String empName;
	private String privateString;
	protected String protectedString;
	public String publicString;
	
	public Employee() {
		
	}
	public Employee(int empID, String empName) {
		this.empID = empID;
		this.empName = empName;
	}
	
	public static void main(String args[]) {
		Employee obj = new Manager();
	}
	
	public void automatioTesting() {
		System.out.println("Child Class testing");	
	}
	
	public void testing() {
		System.out.println("Base Class testing");
	}
}

class Manager extends Employee{
	
	public void testing() {
		
		System.out.println("Child Class testing");	
	}
	
	
}
