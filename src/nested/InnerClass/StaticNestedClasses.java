package nested.InnerClass;

public class StaticNestedClasses {

	static String name = "StaticNestedClasses";
	
	public void display() {
		System.out.println("name: "+name);
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		staticInnerClass.display();
	}
	
	public static void main(String[] args) {

		StaticNestedClasses staticNestedClasses = new StaticNestedClasses();
		staticNestedClasses.display();
	}

	
	static class StaticInnerClass{
		String name = "StaticInnerClass";
		static String staticName = "StaticName";
		
		public void display() {
			System.out.println(name);
			System.out.println(staticName);
		}
		public final static void staticMethod() {
			System.out.println( StaticNestedClasses.name);
			System.out.println(staticName);
		}
	}
}
