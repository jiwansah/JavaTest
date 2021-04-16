package collection.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetGeneralConcept {
	static Comparator<Person> SORT_PERSON_BY_ID = (Person p1, Person p2) -> { return p1.id - p2.id;};
	static Comparator<Person> SORT_PERSON_BY_NAME = Comparator.comparing(Person:: getName);
	static Comparator<Person> SORT_PERSON_BY_ALL = (Person p1, Person p2) -> { 
			return p1.id - p2.id == 0 ? p1.name.compareTo(p2.name) : p1.id - p2.id;
		};
	
	public static void main(String[] args) {

		System.out.println("-------------- Hash Set--------------------");
		Set<ObjWithHashCode> obj = new HashSet<ObjWithHashCode>();
		obj.add(new ObjWithHashCode("Jiwan", 1));obj.add(new ObjWithHashCode("Jiwan", 1));
		System.out.println("ObjWithHashCode: " + obj);
		
		
		Set<ObjWithOutHashCode> obj2 = new HashSet<ObjWithOutHashCode>();
		obj2.add(new ObjWithOutHashCode("Jiwan", 1));obj2.add(new ObjWithOutHashCode("Jiwan", 1));
		System.out.println("ObjWithOutHashCode: " + obj2);
		
		Set<Person> person1 = new HashSet<Person>();
		person1.add(new Person("Jiwan", 1)); person1.add(new Person("Jiwan", 1));
		System.out.println("Person: " + person1);
		
		System.out.println("Contains: "+	obj.contains(new ObjWithHashCode("Jiwan", 1)) );
		System.out.println("Contains: "+	person1.contains(new Person("Jiwan", 1)) );
		
		
		System.out.println("--------------Linked Hash Set--------------------");
		
		Set<Person> person2 = new LinkedHashSet<Person>();
		person2.add(new Person("Jiwan", 1)); person2.add(new Person("Jiwan-1", 1)); person2.add(new Person("Jiwan-2", 2));
		System.out.println("Person2 Set: " + person2);
		
		System.out.println("---------------Sorted Set----------------------");
		SortedSet<Person> personSortedSet = new TreeSet<Person>( SetGeneralConcept.SORT_PERSON_BY_ID );
		personSortedSet.add(new Person("Jiwan", 1)); personSortedSet.add(new Person("Jiwan-1", 1));
		personSortedSet.add(new Person("Jiwan-2", 2));personSortedSet.add(new Person("Jiwan-2", 3));
		System.out.println("Person2 SortedSet: " + personSortedSet);
		
		
		System.out.println("------------------Hash Set----------------------");
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("Jiwan"); stringSet.add(new String("Jiwan")); stringSet.add("Jiwan");
		System.out.println(stringSet);
	}
	
	
	
	
	
}

class ObjWithOutHashCode {

	public String name;
	public int id;
	ObjWithOutHashCode(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name+" : "+id;
	}
}

class ObjWithHashCode {

	public String name;
	public int id;
	ObjWithHashCode(String name, int id){
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		return 12;
	}
	
	@Override
	public String toString() {
		return name+" : "+id;
	}
}

class Person {

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
	Person(String name, int id){
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

class MovieForSort implements Comparable<MovieForSort> {

	int slNumber;
	String movieName;
	public MovieForSort(int slNumber, String movieName) {
		this.slNumber = slNumber;
		this.movieName = movieName;
	}
	
	@Override
	public int compareTo(MovieForSort obj) {
		if (this.slNumber == obj.slNumber) {
			return this.movieName.compareTo(obj.movieName);
		} else if (this.slNumber > obj.slNumber) {
			return 1;
		} else {
			return -1;
		}
	}
}