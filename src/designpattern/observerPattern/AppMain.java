package designpattern.observerPattern;

public class AppMain {

	public static void main(String[] args) {

		Car bmw = new Car("BMW", 200000);
		Car maruti = new Car("Maruti", 100000);
		Car ford = new Car("Ford", 300000);
		
		Dealer skDealer = new Dealer("SK Dealer", bmw );
		Dealer jkDealer = new Dealer("JK Dealer", maruti );
		Dealer mkDealer = new Dealer("MK Dealer", maruti );
		
		maruti.setPrice(210000);
	}

}
