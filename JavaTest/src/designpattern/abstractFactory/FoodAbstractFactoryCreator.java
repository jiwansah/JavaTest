package designpattern.abstractFactory;

public class FoodAbstractFactoryCreator extends FoodAbstractFactory {

	@Override
	public FoodFactory getFood(String food) {
		if("Veg".equals(food)) {
			return new Veg();
		} else {
			return new NonVeg();
		}
	}

}
