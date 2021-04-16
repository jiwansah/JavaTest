package javaTest;

class ParentClass {
	
	public void display() {
		System.out.println("ParentClass Display");
	}
}

interface IData {
	int data = 9;
	public default int getData() {
		return 7;
	}

	public int getMessage();
	
	interface INested{
		int nestedData = 9;
		public int getData();
	}
}

public class RuntimePolymorphisum extends ParentClass{

	public void display() {
		System.out.println("RuntimePolymorphisum Display");
	}
	public void display2() {
		System.out.println("RuntimePolymorphisum Display2");
		int d = IData.data;
		int d2 = IData.INested.nestedData;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass obj = new RuntimePolymorphisum();
		obj.display();
		
		RuntimePolymorphisum obj1 = (RuntimePolymorphisum) obj;
		obj1.display2();
		
	}

}
