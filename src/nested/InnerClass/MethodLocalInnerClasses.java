package nested.InnerClass;

public class MethodLocalInnerClasses {

	String name ="MethodLocalInnerClasses";
	String nameClass ="MethodLocalInnerClasses";
	
	
	MethodLocalInnerClasses() {
		
	}
	public void display() {
		String name = "display";
		String nameMethod = "display";
		
		class InnerClass {
			String name ="InnerClass";
			public void display() {
				System.out.println(name);
				System.out.println(nameMethod);
				System.out.println(nameClass);
				System.out.println(MethodLocalInnerClasses.this.nameClass);
			}
		}
		
		InnerClass i = new InnerClass();
		i.display();
	}
	
	public static void main(String[] args) {
		MethodLocalInnerClasses methodLocalInnerClasses = new MethodLocalInnerClasses();
		methodLocalInnerClasses.display();
	}

}
