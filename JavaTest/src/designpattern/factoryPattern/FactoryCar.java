package designpattern.factoryPattern;

public class FactoryCar {

	public Car getCar(String carName) {
		if("Maruti".equals(carName)) {
			return new Maruti();
		} else {
			return new BMW();
		}
	}
}
