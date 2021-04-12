package javaTest;

import java.util.Collection;

public class Test4 extends Test3{

	public static void main(String[] args) {

		HCL hcl = new HCL(101);
		
		// empid should not be changed in any situation and every employee should have separate empId.
        // Means every object created must have separate copy provided that Id should not be changed but allow only once if required.
        // For this we must declare the member of that object to be readonly.

		// hcl.empID = 1002;
		System.out.println(hcl.empID);
		hcl.display(1011);
		
	}

}


interface  Company1 {
	final String name="";

	
}

class Company {
	final String name;

	public Company(String name) {
		this.name = name;
		System.out.println("Company");
	}
}

class HCL extends Company{
	final int empID;

	public HCL(int empID) {
		super("");
		this.empID = empID;
		System.out.println("HCL");
	}
	
	public void display (int a) {
		System.out.println(a);
	}
}