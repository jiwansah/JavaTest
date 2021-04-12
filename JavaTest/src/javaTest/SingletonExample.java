package javaTest;

public class SingletonExample //implements Cloneable 
{

	private static  final SingletonExample singletonExample = new SingletonExample();
	
	private SingletonExample() {
		
	}
	
	public static  SingletonExample getInstance() {
		return singletonExample;
	}
	
	public  void printMsg(SingletonExample singletonExample) {
		System.out.println("Message For Print Address: " + singletonExample);
		
		synchronized (this){
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		}
		System.out.println("Message out Print");
	}
	
	/*
	@Override
	public Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException();
		return Object.clone();
	}
	*/
	
	public static void main(String []args) throws Exception {
		
		SingletonExample singletonExample = SingletonExample.getInstance();
		SingletonExample singletonExample2 = (SingletonExample) SingletonExample.getInstance().clone();
		
		System.out.println(singletonExample.hashCode());
		System.out.println(singletonExample2.hashCode()); 
		singletonExample2 = null;
		singletonExample.printMsg(singletonExample2);
		
	}
	
}
