package logicTest.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Coronavirus {

	public static void main(String []args) {
		String [] data = {"coronavirus","3","abcde","crnas","onarous" };
		List<String> d = new ArrayList<String>();
		d.add("abcde");d.add("crnas");d.add("onarous");
		/*
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			d.add(scanner.next());
		}
		scanner.close();
		*/

		List<String> result = new ArrayList<String>(data.length-2);
		String virusRange = data[0];
		
		/*
		for(String n: d) {
			result.add("POSITIVE");
			int pindex =0;
			for(int c: n.toCharArray()) {
				
				if((pindex = virusRange.indexOf(c, pindex) ) < 0) {
					result.set(result.size()-1, "NEGATIVE");
					break;
				}
			}
		}
		*/
		
		
		AtomicInteger indexPosition = new AtomicInteger(0);
	/*	Arrays.stream(data, 2, data.length).forEach(s -> {
			result.add("POSITIVE");
			indexPosition.set(0);
			 s.chars().forEach(c -> {
				int p =virusRange.indexOf(c);
				if (p < indexPosition.get()) {
					result.set(result.size()-1, "NEGATIVE");
					return;
				}
				indexPosition.set(p);
			});
			
		});
		*/
		
		Arrays.stream(data, 2, data.length).forEach(s -> {
			result.add("POSITIVE");
			indexPosition.set(0);
			boolean t = s.chars().anyMatch(c -> {
				 
				if (virusRange.indexOf(c, indexPosition.get()) < 0 ) {
					result.set(result.size()-1, "NEGATIVE");
					return true;
				}
				
				return false;
			});
			System.out.println(t);
		});
		
		System.out.println(result); 
		
	}
}
 