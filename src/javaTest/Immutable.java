package javaTest;

import java.util.ArrayList;
import java.util.List;

public final class Immutable {

	private final String name, address;
	
	Immutable(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {

		String s1 = new String("Test");
		String s2 = new String("Test");
		Immutable immutable = new Immutable("test", "tesst-2");
		Immutable immutable2;
		ArrayList<String> list = new ArrayList<String>();
		list.add("Data-1"); list.add("Data-2"); list.add("Data-3"); list.add("Data-4");
		ArrayList<String> list2 = (ArrayList<String>) list.clone();
		list2.add("Data-5");
		System.out.println(list);
		System.out.println(list2);
		
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	
}
