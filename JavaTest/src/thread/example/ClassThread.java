package thread.example;

import java.io.IOException;

public class ClassThread extends Thread{
	private String msg = "";
	public ClassThread(String msg){
		this.msg = msg;
	}
	public void run() {
		try {

			for(int i=0; i< 6; i++) {
				System.out.println(msg + " : "+i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("I am in run method");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ClassThreadRunnable());
		t.start();
		t.interrupt();
		
		// Join
		ClassThread ct1 = new ClassThread("Test-1");
		ct1.start();
		
		ClassThread ct2 = new ClassThread("Test-2");
		ct2.start();
		ct2.join();
		System.out.println("Apply Join");
		
		
		System.out.println("Test");
		try {
			t.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

class ClassThreadRunnable implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000*2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("I am in run method of ClassThreadRunnable");
	}
	
}

