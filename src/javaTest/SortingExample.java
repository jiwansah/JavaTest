package javaTest;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Book {
	int slNumber;
	String name;
	public Book(int slNumber, String name) {
		this.slNumber = slNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return this.slNumber+" : "+this.name;
	}
}

class Movie implements Comparable<Movie> {

	int slNumber;
	String movieName;
	public Movie(int slNumber, String movieName) {
		this.slNumber = slNumber;
		this.movieName = movieName;
	}
	
	@Override
	public int compareTo(Movie obj) {
		if (this.slNumber == obj.slNumber) {
			return this.movieName.compareTo(obj.movieName);
		} else if (this.slNumber > obj.slNumber) {
			return 1;
		} else {
			return -1;
		}
	}
}


class EmployeeComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empID == o2.empID) {
			return o1.empName.compareTo(o2.empName);
		} else if (o1.empID > o2.empID) {
			return 1;
		} else {
			return -1;
		}
	}
	
}

public class SortingExample {

	
	public static void main(String[] args) {

		System.out.println("===========================Comparable==================================");
		// Example for Comparable
		ArrayList<Movie> moviesList = new ArrayList<Movie>();
		moviesList.add(new Movie(32, "Test1"));
		moviesList.add(new Movie(2, "2Test"));
		moviesList.add(new Movie(100, "Test-Name"));
		moviesList.add(new Movie(2, "Name"));
		
		Collections.sort(moviesList);
		moviesList.forEach(data -> {
			System.out.println(data.slNumber + " : "+data.movieName);
		});
		
		System.out.println("--------------Reverse---------------------");
		
		Collections.sort(moviesList, Collections.reverseOrder());
		moviesList.forEach(data -> {
			System.out.println(data.slNumber + " : "+data.movieName);
		});
		
		System.out.println("==========================Comparator============================================");
		// Example for Comparator
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(32, "Test1"));
		employeeList.add(new Employee(2, "2Test"));
		employeeList.add(new Employee(100, "Test-Name"));
		employeeList.add(new Employee(2, "Name"));
		
		Collections.sort(employeeList, new EmployeeComparator());
		employeeList.forEach(data -> {
			System.out.println(data.empID + " : "+data.empName);
		});
		
		System.out.println("-------------Reverse-----------------");
		
		Collections.sort(employeeList,Collections.reverseOrder( new EmployeeComparator()) );
		employeeList.forEach(data -> {
			System.out.println(data.empID + " : "+data.empName);
		});
		
		System.out.println("==========================Lambda Expression========================================");
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(32, "Test1"));
		bookList.add(new Book(2, "2Test"));
		bookList.add(new Book(100, "Test-Name"));
		bookList.add(new Book(2, "Name"));
		Collections.sort(bookList, (Book obj1, Book obj2)->{ return obj1.slNumber == obj2.slNumber ? 0 : obj1.slNumber > obj2.slNumber ? 1 : -1; } );
		
		// this is not correct sorting so commented, but do some sort of 
		//Collections.sort(bookList, (Book obj1, Book obj2)->{ return obj1.toString().compareTo(obj2.toString()); } );
		
		bookList.forEach(data -> {
			System.out.println(data.toString());
		});
		
	}
		
}
