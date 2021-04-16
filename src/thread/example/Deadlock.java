package thread.example;

public class Deadlock {

	public static void main(String[] args) {

		Friend arnab = new Friend("Arnab");
		Friend akshat = new Friend("Akshat");
		
		Thread t1 =new Thread(()->arnab.bow(akshat)); // T1
		t1.start();
		
		/*try {
			Thread.sleep(1000*4);
		}catch(Exception e) {
		}*/
		
		Thread t2 = new Thread(()->akshat.bow(arnab)); // T2
		t2.start();
		/*
		T1 (arnab.bow .bowback ) - akshat.bowBack
		T2 (akshat.bow ,bowback);
		*/
	}

	
	static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
            
        }
    }

}
