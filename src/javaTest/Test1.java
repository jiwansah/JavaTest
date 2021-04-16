package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;




public class Test1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
	}
	
	public static void test1() {
		List<Integer> grades = new ArrayList();
		grades.add(73);grades.add(67);grades.add(38);grades.add(33);
		
		
		List<Integer> grades2 = grades.stream().map(i -> i + ((i > 37) && (i%5 > 2) ? 5 -(i%5) : 0)  ).collect(Collectors.toList());
		
		grades2.forEach(i -> System.out.print(i+", "));
	}
	
	public static void test() {
		
		int [] p = {100, 100, 50, 40, 40, 20, 10};
		int [] b = {5, 25, 50, 120};
		Set<Integer> s = Stream.concat(Arrays.stream(p).boxed(), Arrays.stream(b).boxed()).collect(Collectors.toSet());
		
		List<Integer> l = s.stream().collect(Collectors.toList());
		//Collections.reverse(l);
		l.sort(Comparator.reverseOrder());
		l.stream().forEach(i -> System.out.print(i+", "));
		int[] returnData = new int[b.length];
		IntStream.range(0, b.length).forEach(index -> {returnData[index] = l.indexOf(b[index])+1; });
		System.out.println("");
		Arrays.stream(returnData).forEach(i -> System.out.print(i+", "));	
		
		//////////
		/*
		int [] s = {100, 100, 50, 40, 40, 20, 10}; // {100, 90, 90, 80, 75, 60};// 
		int [] a =  {5, 25, 50, 120}; //{50, 65, 77, 90, 102};//
		int [] r = new int[a.length];
		s = IntStream.of(s).distinct().toArray();
		for(int i=0; i < a.length; i++ ) {
			for(int j=0; j < s.length; j++ ) {
				
				 int k= a[i] == s[j] ? r[i]=j+1 :
                    s[j] < a[i] ? r[i]=j+1 :
                        s.length==j+1 ? r[i]=j+2 : -1;
                    
                 if(k != -1) break;
			}
		}
		
		Arrays.stream(r).forEach(i-> System.out.print(i));
		*/
	}
	
	 public static void pickingNumbers( int [] p) {
		 int [] r = new int [5];
		 
		 List<Integer> list =  Arrays.stream(p).boxed().collect(Collectors.toList());
		 
		 IntStream.range(1, 6).forEach(i -> {
			 
			 System.out.print(i+", ");
			 System.out.print(list.indexOf(i)+1+", ");
			 System.out.print(list.indexOf(list.indexOf(i)+1 )+1+", ");
			 System.out.println("--");
			 r[i-1] = list.indexOf(list.indexOf(i)+1 )+1;
			 
		 });
		 System.out.println("--------");
		 for(int a: r) {
			 System.out.print(a+", ");
		 }
	 }
	 
	 public static int pickingNumbers(List<Integer> a) {
		 
		 AtomicInteger value = new AtomicInteger(a.get(0));

		 
		 List<List<Integer>> lists = new ArrayList<>(a.stream().collect(Collectors.groupingBy(data -> data%2 ==0 ? data : data+1)).values());
		 
		 int l = a.stream().collect(Collectors.groupingBy(data -> data%2 ==0 ? data : data+1)).size();
		 
		 List<List<Integer>> lists2 = new ArrayList<>(a.stream().collect(Collectors.groupingBy(data -> data%2 ==0 ? data : data-1)).values());
		 
		 //System.out.println(" : "+l);
		 int l1 = lists.stream().mapToInt(List::size).max().getAsInt();
		 int l2 = lists2.stream().mapToInt(List::size).max().getAsInt();

		 System.out.println(l1 +" : "+l2);
		 
		 for (List<Integer> i : lists) {
			 for (int f : i) {
				 System.out.print(f+",");
			 }
			 System.out.println("");
		 }
		 System.out.println("========");
		 for (List<Integer> i : lists2) {
			 for (int f : i) {
				 System.out.print(f+",");
			 }
			 System.out.println("");
		 }
		 
		 return l1>l2 ? l1 : l2;
	 }

}
