package collection.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {

	public static void main(String[] args) {

		List<String> listString = new ArrayList<String>();
		listString.add("I");listString.add("am");listString.add("java");listString.add("Student");
		System.out.println(listString.add("Test"));
		System.out.println(listString.add("Test"));
		System.out.println(listString);
		System.out.println(listString.get(3));
		System.out.println(listString.subList(2, 3));
		
		Collections.reverse(listString);
		Collections.shuffle(listString);
		Collections.rotate(listString,1); 
		Collections.swap(listString, 1, 0);
		Collections.shuffle(listString);
		
	}

}

class PersonList {

	public String name;
	public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	PersonList(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return name+" : "+id;
	}
	@Override
	public int hashCode() {
		return (this.id + 2) * this.name.length();
	}
	@Override
	public boolean equals(Object obj) {
		return this.name.equals( ((Person)obj).name) && this.id == ((Person)obj).id;
		//return this.id == ((Person)obj).id;
	}
}
