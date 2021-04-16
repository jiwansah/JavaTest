package designpattern.abstractFactory;

public class NonVeg extends FoodFactory{

	@Override
	public Food getFood(String food) {
		if ("ChickenTikka".equals(food) ) {
			return new ChickenTikka();
		} else {
			return new FishFry();
		}
	}

}
