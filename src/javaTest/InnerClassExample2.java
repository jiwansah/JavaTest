package javaTest;

public class InnerClassExample2 {


	    public int x = 0;

	    class FirstLevel {

	        public int x = 1;

	        void methodInFirstLevel(int x) {
	            System.out.println("x = " + x);
	            
	            System.out.println("this.x = " + this.x);
	            System.out.println("InnerClassExample2.this.x = " + InnerClassExample2.this.x);
	        }
	    }

	    public static void main(String... args) {
	        InnerClassExample2 st = new InnerClassExample2();
	        InnerClassExample2.FirstLevel fl = st.new FirstLevel();
	        fl.methodInFirstLevel(23);
	        Object o = 1;
	        System.out.println(o);
	    }
	
}
