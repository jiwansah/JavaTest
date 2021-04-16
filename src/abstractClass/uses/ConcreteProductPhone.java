package abstractClass.uses;

public class ConcreteProductPhone extends ProductLG{

	private String modelName, expiryDate;
	
	public ConcreteProductPhone(String modelName, String expiryDate) {
		this.modelName = modelName;
		this.expiryDate = expiryDate;
	}
	
	@Override
	public String getExpiryDate() {
		return this.expiryDate;
	}

	@Override
	public String getModelName() {
		return this.modelName;
	}

	@Override
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
