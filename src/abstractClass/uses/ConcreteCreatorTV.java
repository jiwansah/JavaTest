package abstractClass.uses;

public class ConcreteCreatorTV extends Creator{

	@Override
	public ProductLG serveRequest(String name) {
		return new ConcreteProductTV("TV-120", "1-Years");
	}

}
