package collection.concept;

public class ObjWithHashCode1 {

	public String name;
	public int id;
	ObjWithHashCode1(String name, int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 12;
	}
	
}
