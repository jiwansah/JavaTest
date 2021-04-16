package designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private int price;
	private String name;
	private List<Dealer> observer = new ArrayList<Dealer>();
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void attach(Dealer dealer) {
		this.observer.add(dealer);
	}
	
	private void notifyAllObserver() {
		for (Dealer dealer: this.observer) {
			dealer.update();
		}
	}
	
	
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		this.notifyAllObserver();
	}
	
	
	
	
}
