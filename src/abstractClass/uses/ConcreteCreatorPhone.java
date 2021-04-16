package abstractClass.uses;

public class ConcreteCreatorPhone extends Creator{

	@Override
	public ProductLG serveRequest(String name) {
		return new ConcreteProductPhone("Phone-120", "1-Years");
	}

}
