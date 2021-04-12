package designpattern.abstractFactory;

public class Veg extends FoodFactory{

	@Override
	public Food getFood(String food) {
		if ("PaneerKarahi".equals(food) ) {
			return new PaneerKarahi();
		} else {
			return new MixVeg();
		}
	}

}
