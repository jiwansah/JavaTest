package thread.lock;

import javaTest.SingletonExample;

public class ThreadRunnerForStatic implements Runnable {

	String call = "";
	SingletonExample singletonExample = SingletonExample.getInstance();
    ThreadRunnerForStatic() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new ThreadRunnerForStatic());
		Thread t2 = new Thread(new ThreadRunnerForStatic());
		
		t1.start();
		t2.start();

	}

	@Override
	public void run() {

		singletonExample.printMsg(singletonExample);
	}

	
	
}
