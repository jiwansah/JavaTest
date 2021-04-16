package abstractClass.uses;

public class ConcreteProductTV extends ProductLG{

	private String modelName, expiryDate;
	
	public ConcreteProductTV(String modelName, String expiryDate) {
		this.modelName = modelName;
		this.expiryDate = expiryDate;
	}
	
	@Override
	public String getExpiryDate() {
		// TODO Auto-generated method stub
		return expiryDate;
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return modelName;
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
