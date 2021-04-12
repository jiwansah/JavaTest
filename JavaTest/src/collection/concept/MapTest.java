package collection.concept;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {

		List<Person1> data = new ArrayList<Person1>();
		data.add(new Person1("Test-1", "Maharashtra", "Mumbai", 30000));
		data.add(new Person1("Test-2", "Maharashtra", "Thane", 40000));
		data.add(new Person1("Test-5", "WestBengal", "Kolkata", 12000));
		data.add(new Person1("Test-4", "Delhi", "Delhi", 50000));
		data.add(new Person1("Test-3", "Maharashtra", "Mumbai", 3000));
		
		
		Map<String, List<Person1>> personInState = data.stream().collect(Collectors.groupingBy(Person1::getState));
		System.out.println(personInState);
		
		Map<String, Map<String, List<Person1>>> personInStateCity = data.stream().collect(
				Collectors.groupingBy(Person1::getState, Collectors.groupingBy(Person1::getCity)));
		System.out.println(personInStateCity);
		
		Map<String, Map<Integer, List<Person1>>> personInStateSalary = data.stream().collect(
				Collectors.groupingBy(Person1::getState, Collectors.groupingBy(Person1::getSalary)));
		System.out.println(personInStateSalary);
		
		System.out.println("===================Hash Table==========================");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        System.out.println(ht);
        
		System.out.println("===================MAP==========================");
		Map<Person1, String> personMap = new HashMap<MapTest.Person1, String>();
		personMap.put(new Person1("Test-3", "Maharashtra", "Mumbai", 30000), "Test-3");
		personMap.put(new Person1("Test-2", "Maharashtra", "Mumbai", 30000), "Test-2");
		personMap.put(new Person1("Test-1", "Maharashtra", "Mumbai", 30000), "Test-1");
		System.out.println(personMap);
		
		System.out.println("===================Sortrd MAP==========================");
		SortedMap<Person1, String> personSortedMap = new TreeMap<MapTest.Person1, String>(Comparator.comparing(Person1::getName));
		System.out.println(personSortedMap.put(new Person1("Test-3", "Maharashtra", "Mumbai", 30000), "Test-3"));
		System.out.println(personSortedMap.put(new Person1("Test-2", "Maharashtra", "Mumbai", 30000), "Test-2"));
		System.out.println(personSortedMap.put(new Person1("Test-1", "Maharashtra", "Mumbai", 30000), "Test-111"));
		System.out.println(personSortedMap.put(new Person1("Test-1", "Maharashtra", "Mumbai", 30000), "Test-11"));
		System.out.println(personSortedMap);
		
		System.out.println("===================Sortrd MAP Comparable==========================");
		SortedMap<PersonForMap, String> personSortedMap2 = new TreeMap<MapTest.PersonForMap, String>();
		personSortedMap2.put(new PersonForMap("Test-3", "Maharashtra", "Mumbai", 30000), "Test-3");
		personSortedMap2.put(new PersonForMap("Test-2", "Maharashtra", "Mumbai", 30000), "Test-2");
		personSortedMap2.put(new PersonForMap("Test-1", "Maharashtra", "Mumbai", 30000), "Test-1");
		System.out.println(personSortedMap2);
		
		System.out.println("===================NavigableMap MAP Comparable==========================");
		NavigableMap<PersonForMap, String> personNavigableMap = new TreeMap<MapTest.PersonForMap, String>();
		personNavigableMap.put(new PersonForMap("Test-3", "Maharashtra", "Mumbai", 30000), "Test-3");
		personNavigableMap.put(new PersonForMap("Test-2", "Maharashtra", "Mumbai", 30000), "Test-2");
		personNavigableMap.put(new PersonForMap("Test-1", "Maharashtra", "Mumbai", 30000), "Test-1");
		System.out.println(personNavigableMap);
		System.out.printf("Floor Entry  : %s%n",personNavigableMap.floorEntry(new PersonForMap("Test-2", "Maharashtra", "", 0)));
		System.out.printf("First Entry  : %s%n", personNavigableMap.firstEntry());
		//System.out.printf("Sub Map Entry  : %s%n", personNavigableMap.subMap(fromKey, toKey));

		System.out.println("===================ConcurrentNavigableMap MAP Comparable==========================");
		ConcurrentNavigableMap<String, String> concurrentNavigableMap = new ConcurrentSkipListMap<String, String>();
		concurrentNavigableMap.put("Test-3", "Test-3");
		concurrentNavigableMap.put("Test-2", "Maharashtra");
		concurrentNavigableMap.put("Test-1", "Maharashtra");
		System.out.println(concurrentNavigableMap);
		System.out.printf("Sub Map Entry  : %s%n", concurrentNavigableMap.subMap("Test-1", "Test-2"));
		
		System.out.println("------------------Map example---------------------");
		Map<String, String> ms = new HashMap<String, String>();
		ms.put("Test-1", "1"); ms.put("Test-4", "4"); ms.put("Test-3", "3"); ms.put("Test-2", "2"); 
		System.out.println(ms);

		ms.remove("Test-1", "1");
		System.out.println(ms);
		
		System.out.println("------------------Map Hashtable ---------------------");
		Map<String, String> mht = new Hashtable<String, String>();
		mht.put("Data", "Data-1"); mht.put("Data-Two", "Data-2"); mht.put("Data-Three", "Data-3"); 
		System.out.println(mht);
		
	}

	static class Person1 {
		private String name =null, state=null, city=null;
		private int salary;
		
		public Person1(String name, String state, String city, int salary){
			this.name = name;
			this.state=state;
			this.city=city;
			this.salary=salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name+" "+state+" "+city+" "+salary;
		}
	}
	

	static class PersonForMap implements Comparable<PersonForMap> {
		private String name =null, state=null, city=null;
		private int salary;
		
		public PersonForMap(String name, String state, String city, int salary){
			this.name = name;
			this.state=state;
			this.city=city;
			this.salary=salary;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name+" "+state+" "+city+" "+salary;
		}

		@Override
		public int compareTo(PersonForMap o) {
			return this.name.compareTo(o.name);
		}
	}

}
