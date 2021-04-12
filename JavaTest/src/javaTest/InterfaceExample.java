package javaTest;

interface IInterface{
	int iData = 9;
	
	
	void getData();
	
	public default void getDefaultData() {
		System.out.println("In getDefaultData");
	}
	public static int getStaticData() {
		System.out.println("In getStaticData");
		return 8;
	}
}

public class InterfaceExample implements IInterface {

	static {
		System.out.println("static Block");
	}
	public void getData() {
		System.out.println("getData in ChildClass");
	}
	
	public static void main(String[] args) {
		
		InterfaceExample i = new InterfaceExample();
	//	 i.getStaticData(); // Not Valid
		IInterface.getStaticData();
		
	}

}
