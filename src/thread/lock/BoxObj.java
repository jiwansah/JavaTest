package thread.lock;

public class BoxObj {


	public void dispaly() {
		try {
			System.out.println(" I am in dispaly");
			Thread.sleep(1000 * 5);
			System.out.println(" I am out dispaly");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void dispalyStatic() {
		try {
			System.out.println("I am in display static");
			Thread.sleep(1000 * 5);
			System.out.println("I am out display static");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void dispalySync() {
		try {
			System.out.println(" I am in dispaly sync");
			Thread.sleep(1000 * 5);
			System.out.println(" I am out dispaly sync");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public synchronized static void dispalyStaticSync() {
		try {
			System.out.println("I am in display static sync");
			Thread.sleep(1000 * 5);
			System.out.println("I am out display static sync");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
