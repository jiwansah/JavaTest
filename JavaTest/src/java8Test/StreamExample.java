package java8Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;



public class StreamExample {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		String filteredEmpty = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		String filteredEmpty2 = strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("input: " + strings);
		System.out.println("Out: " + filteredEmpty);
		strings.stream().forEach(System.out::print);
		
		System.out.println();
		System.out.println("========================================================");
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		Function<Integer,Integer> doSquare = (Integer a) -> {return a * a;};
		BiFunction<Integer, Integer, Integer> doSquare2 = (Integer a,Integer b) -> {return a * b;};
		List<Integer> squaresList = numbers.stream().map( doSquare ).collect(Collectors.toList());
		System.out.println("Input: "+numbers);
		System.out.println("Output: "+squaresList);
		
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());

		numbers.stream().limit(3).forEach(System.out::println);
		System.out.println("========================================================");
	
		List<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(new Student("Test-1", 300)); listOfStudent.add(new Student("Test-2", 100));
		listOfStudent.add(new Student("Test-1", 400)); listOfStudent.add(new Student("Test-2", 200));
		
		listOfStudent.stream().mapToInt(Student::getMarks).forEach(action-> System.out.print(action + " ,"));
		int sum = listOfStudent.stream().mapToInt(Student::getMarks).reduce(0,(m1, m2) ->{ return m1+m2; });
		System.out.println("");
		System.out.println("Sum: " + sum);
		
		System.out.println("===================stream collect GroupBy=====================================");
		
		List<Student> data = new ArrayList<Student>();
		data.add(new Student("Test-1", 30000));
		data.add(new Student("Test-2", 40000));
		data.add(new Student("Test-5", 12000));
		data.add(new Student("Test-4", 50000));
		data.add(new Student("Test-3", 3000));
		
		
		Map<Integer, List<Student>> studentByMarks = data.stream().collect(Collectors.groupingBy(Student::getMarks));
		System.out.println(studentByMarks);
		
		System.out.println("===============Sort========================");
		data.stream().sorted((a, b)-> a.marks - b.marks).forEach(i -> System.out.println(i.name));
		String []arrayData = {"Test-1", "Test-2", "Test-3", "Test-4", "Test-5"};
		
	}

	static class Student {
		String name;
		int marks;
		Student(String name, int marks) {
			this.name = name;
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		
	}
}
