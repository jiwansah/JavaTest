package designpattern.abstractFactory;

public class AppMain {

	public static void main(String[] args) {

		FoodAbstractFactoryCreator foodCreator = new FoodAbstractFactoryCreator();
		FoodFactory foodFactoryVeg = foodCreator.getFood("Veg");
		Food paneerKarahi = foodFactoryVeg.getFood("PaneerKarahi");
		Food mixVeg = foodFactoryVeg.getFood("MixVeg");
		
		FoodFactory foodFactoryNonVeg = foodCreator.getFood("NonVeg");
		Food chickenTikka = foodFactoryNonVeg.getFood("ChickenTikka");
		Food fishFry = foodFactoryNonVeg.getFood("FishFry");
		
		paneerKarahi.getFood();
		mixVeg.getFood();
		chickenTikka.getFood();
		fishFry.getFood();
	}

}
