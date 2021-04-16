package nested.InnerClass;

public class NestedInnerClass {

	String name = "NestedInnerClass";
	String nameOuter = "NestedInnerClass";
	
	public void display() {
		String name ="display";
		System.out.println(name);
		InnerClass ic = new NestedInnerClass(). new InnerClass();
		ic.display();
		System.out.println( ic.nameStatic );
		System.out.println(NestedInnerClass.InnerClass.nameStatic);
	}
	public void display2() {
		String name ="display2";
		System.out.println(name);
	}
	public static void main(String[] args) {

		NestedInnerClass i = new NestedInnerClass();
		i.display();
	}

	
	public class InnerClass {
		String name = "InnerClass";
		static final String nameStatic="Static Final data";
		
		public void display() {
			NestedInnerClass.this.display2();
			System.out.println(name);
			System.out.println(nameOuter);
		}
		/* Give compilation error
		public static void displayStatic() {
			NestedInnerClass.this.display2();
		}*/
	}
}
