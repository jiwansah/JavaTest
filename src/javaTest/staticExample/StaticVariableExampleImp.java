package javaTest.staticExample;


class ParentClass {
	
	protected int instanceValue = getInstanceData();
	public static int staticValue = getStaticData();
	
	
	private static int getStaticData() {
		System.out.println("ParentClass : BaseClass: getStaticData");
		return 8;
	}
	
	public int getInstanceData(){
		System.out.println("ParentClass getInstanceData");
		return 1;
	}
	static {
		System.out.println("static block from ParentClass : BaseClass");
	}
	
	{
		System.out.println("init block from ParentClass");
	}
	
	ParentClass() {
		System.out.println("Constructor ParentClass");
	}
}


public class StaticVariableExampleImp extends ParentClass {

	public static int staticValue = getStaticData();
	public int instanceValue = getInstanceDataChild();
	
	static {
		System.out.println("static block from ChildClass");
	}
	
	{
		System.out.println("init block from ChildClass");
	}
	
	private static int getStaticData() {
		System.out.println("ChildClass: getStaticData");
		return 5;
	}
	public int getInstanceDataChild(){
		System.out.println("ChildClass getInstanceData");
		return 1;
	}
	
	StaticVariableExampleImp() {
		System.out.println("ChildClass Constructor StaticVariableExampleImp");
	}
	public static void main(String[] args) {

		
		StaticVariableExampleImp obj1 = new StaticVariableExampleImp();
		System.out.println("Static Data: " + obj1.staticValue );
		System.out.println("Instance Data: " + obj1.instanceValue );
	
		/*
		ParentClass obj2 = new StaticVariableExampleImp();
		System.out.println("Static Data: " + obj2.staticValue );
		System.out.println("Instance Data: " + obj2.instanceValue );
		*/
	}

}
