package nested.InnerClass;

public class AnonymousInnerClasses {

	String name = "AnonymousInnerClasses";
	
	public void display() {
		String name = "AnonymousInnerClasses: display";
		
		BaseClass baseClass = new BaseClass() {
			String name = "ExtendedBaseClass";
			
			public void display() {
				String name = "Extended BaseClass: display";
				System.out.println(name);
				System.out.println(this.name);
				System.out.println(super.name);
				System.out.println(AnonymousInnerClasses.this.name);
			}
		};
		baseClass.display();
		
		System.out.println("==============Anonymous Inner Class by inheritance ================");
		new Hello() {
			@Override
			public void show() {
				System.out.println(name);
			}
		}.show();
		
	}
	
	
	
	public static void main(String[] args) {
		AnonymousInnerClasses anonymousInnerClasses = new AnonymousInnerClasses();
		anonymousInnerClasses.display();
	}

}


class BaseClass{
String name = "BaseClass";
	
	public void display() {
		String name = "BaseClass: display";
	}
}

interface Hello { 
    void show(); 
} 