package javaTest;

public class FinalExample {

	static final String msg;
	
	static {
		msg = "";
	}
	FinalExample() {
		// msg = "";
	}
	
	public static void main(String[] args) {
		FinalClass f = new FinalClass();
	}

}

// can not access final class out side of the package
final class FinalClass{
	
}
