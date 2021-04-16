package exception.concept;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionConcept {

	int count = 0;
	static int count2 = 0;
	
	public ExceptionConcept() {
		
	}
	
	public static void main(String []args) throws IOException{
		ExceptionConcept obj = new ExceptionConcept();
		
		int i =0;
		/*
		try(ExceptionConcept obj1 = new ExceptionConcept()){
			obj1.display();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
*/
		System.out.println(obj.display());
		System.out.println(ExceptionConcept.displayStatic());
		
		try {
			try {
				obj.checkedExcetion();
			} catch (IOException e) {
				Exception ex = new SQLException();
				ex.addSuppressed(e);
				e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			}
		} 
		finally{
			
		}
		
	}
	
	
	public int display() {
		try {
			count++;
			throw new Exception();
			
		} catch(Exception e) {
			count++;
			return count;
		} finally {
			count++;
		}
	}
	
	public ExceptionConcept displayObj() {
		ExceptionConcept exConcept = new ExceptionConcept();
		try {
			exConcept.count++;
			throw new Exception();
			
		} catch(Exception e) {
			exConcept.count++;
			return exConcept;
		} finally {
			exConcept.count++;
		}
	}
	
	public ExceptionConcept displayObjReassign() {
		ExceptionConcept exConcept = new ExceptionConcept();
		try {
			exConcept.count++;
			throw new Exception();
			
		} catch(Exception e) {
			exConcept.count++;
			return exConcept;
		} finally {
			return exConcept = new ExceptionConcept();
		}
	}
		
	public static int displayStatic() {
		try {
			ExceptionConcept.count2++;
			throw new Exception();
			
		} catch(Exception e) {
			ExceptionConcept.count2++;
			return ExceptionConcept.count2;
		} finally {
			ExceptionConcept.count2++;
			System.out.println("I am Finally block in displayStatic: " + ExceptionConcept.count2);
			
		}
	}
	
	@SuppressWarnings("finally")
	public int displayFinallyReturn() {
		try {
			ExceptionConcept.count2++;
			return 1;
			
		} catch(Exception e) {
			ExceptionConcept.count2++;
			return 2;
		} finally {
			return 3;
		}
	}
	
	public void checkedExcetion () throws IOException{
		
	}
	public void unCheckedExcetion () throws NullPointerException{
		
	}

	
}
