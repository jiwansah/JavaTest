package exception.concept;

import java.io.IOException;

public class AppMain {

	public static void main(String[] args) {

		ExceptionConcept concept = new ExceptionConcept();
//		System.out.println("Return Type display: " +  concept.display() );
//		
//		System.out.println("Return Type displayStatic: " +  concept.displayStatic() );
//		System.out.println("ExceptionConcept static data: " + ExceptionConcept.count2);
//		
		//System.out.println("Return Type displayObj: " +  concept.displayObj().count );
		System.out.println("Return Type displayObjReassign: " +  concept.displayObjReassign().count );
		
		///System.out.println("Display displayFinallyReturn: " +  concept.displayFinallyReturn() );
		
		try {
			concept.checkedExcetion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		concept.unCheckedExcetion();
	}

}
