package javaTest;

public class StaticClassExample {

	static final String data = getStaticData();
	
	public StaticClassExample(){
	}

	private static String getStaticData() {
		InnerClass i = new InnerClass();
		return "Jiwan-"+i.number;
	}
	public static void main(String[] args) {
		
		StaticClassExample.InnerClass in = new StaticClassExample.InnerClass();
		StaticClassExample.InnerClass in2 = new StaticClassExample.InnerClass();
		
		System.out.println(in + " : " + in2);
		
		SingletonExample sg = SingletonExample.getInstance();
		SingletonExample sg2 = SingletonExample.getInstance();
		
		System.out.println(sg + " : " + sg2);
	}

	public final static class InnerClass{
		
		int number = 9;
		public void mesage() {
			System.out.println("Message: ");
		}
	}
}
