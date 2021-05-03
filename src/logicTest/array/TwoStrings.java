package logicTest.array;

import java.util.Arrays;
import java.util.stream.IntStream;

// If any char match return YES or NO
public class TwoStrings {

	public static void main(String[] args) {

		String data1 = "test";
		String data2 = "best";
		System.out.println( solution2( data1, data2) );
		
	}

	static String solution2(String s1, String s2) {
		IntStream c2 = s2.chars();
		boolean anyMatch = s1.chars().anyMatch(item -> {
			return c2.anyMatch(item2 -> item==item2);
		});
		
		return anyMatch ? "YES" : "NO";
   }
	
	 static String solution1(String s1, String s2) {
	        char []c1 = s1.toCharArray();
	        char []c2 = s2.toCharArray();
	        for(char c: c1 ){
	            for(char ca: c2 ){
	                if(c == ca) return "YES";
	            }
	        }
	        return "NO";
	   }

}
