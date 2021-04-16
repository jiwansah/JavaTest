package designpattern.factoryPattern;

public class AppMain {

	public static void main(String[] args) {

		FactoryCar factoryCar = new FactoryCar(); 
		Car marutiCar = factoryCar.getCar("Maruti");
		Car bmwCar = factoryCar.getCar("BMW");
		
		marutiCar.drive();
		bmwCar.drive();
	}

}
