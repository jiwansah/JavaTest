package oops.Example;

import javaTest.Test4;

public class VariablePractice {

	final int empID;
	public VariablePractice(int empID) {
		this.empID = empID;
	}

	public VariablePractice() {
		this.empID = 0;
	}

	
		
	public static void main(String[] args) {
		
		
		VariablePractice obj1 = new VariablePractice(12);
		VariablePractice obj2 = new VariablePractice(50);
		System.out.println(obj1.empID + " "+ obj2.empID);
		
		
	}

}
