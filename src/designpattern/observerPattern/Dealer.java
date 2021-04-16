package designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Observer{
	private String name;

	public Dealer(String name, Car car) {
		this.name = name;
		this.car = car;
		this.car.attach(this);
	}
	@Override
	public void update() {
		System.out.println( "Hi "+ this.name +": "+ this.car.getName() + " Price Change to "+this.car.getPrice());
	}
	
	 

}
