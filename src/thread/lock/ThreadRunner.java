package thread.lock;

public class ThreadRunner implements Runnable {

	String msg = "", call = "";
	BoxObj box = new BoxObj();
	ThreadRunner(BoxObj box, String call) {
		this.box = box; this.call = call;
	}
	
	public static void main(String[] args) {

		BoxObj box = new BoxObj();
		Thread th = new Thread();
		th.start();
		Thread t1 = new Thread(new ThreadRunner(box, "display"));
		t1.start();
//		Thread t2 = new Thread(new ThreadRunner(box, "dispalyStatic"));
//		t2.start();
		
		/*
		Thread t3 = new Thread(new ThreadRunner(box, "dispalySync"));
		t3.start(); 
		
		Thread t5 = new Thread(new ThreadRunner(box, "dispalySync"));
		t5.start(); 
		*/
		
		Thread t4 = new Thread(new ThreadRunner(box, "dispalyStaticSync"));
		t4.start(); 
		
		Thread t6 = new Thread(new ThreadRunner(box, "dispalySync"));
		t6.start(); 
		
		
		try {
			Thread.sleep(1000 * 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("=====================================");
	}


	@Override
	public void run() {
		if (this.call.equals("display")) {
			box.dispaly();
		} else if(this.call.equals("dispalyStatic")) {
			box.dispalyStatic();
		} else if(this.call.equals("dispalyStaticSync")) {
			box.dispalyStaticSync();
		} else if(this.call.equals("dispalySync")) {
			box.dispalySync();
		}
		
	}

}
