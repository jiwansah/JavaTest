package logicTest.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String range = "1 10";
		List<String> data = new ArrayList<String>();
		data.add("5 5");data.add("2 7");data.add("8 10");data.add("10 20");data.add("4 5");
		
		
		data.stream().forEach(value ->{		
			String[] strRange = value.split(" ");
			int []primeNumbers = IntStream.range(Integer.parseInt(strRange[0]), Integer.parseInt(strRange[1])+1).
										filter(PrimeNumber::isPrime).toArray();
			
			if(primeNumbers.length == 0) {
				System.out.println("-1");
			} else if(primeNumbers.length==1) {
				System.out.println("0");
			}else {
				System.out.println( primeNumbers[primeNumbers.length-1] - primeNumbers[0] );
			}
		});
		
	}
	public static boolean isPrime(int number) {
		return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
	}
}
