package javaTest;


 class Test3 {

	String s;
	
	static {
		System.out.println("Static Test3");
	}
	
	 void display(String data) {
		System.out.println(data);
	}
	
	public static void main(String []arg) {
		int i;
		String m;
		Test3 t = new Test3();
		Test3 t2 = new Test3();
		System.out.println( t == t);
		System.out.println( t == t2);
		System.out.println( t.equals(t2) );
	}
}
