package logicTest.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class NewYearChaos {

	/*
	 * array is [1,2,3,4,5]
	 * person will sift 1 point forward if he give bribe
	 * [2, 1, 5, 3, 4]
	 * in this 2 person has give 1 time bribe.
	 * 5 have given 2 time bribe
	 * O/P:
	 * Print the minimum number of bribes necessary e.g 2 or "Too chaotic" if someone has bribed more than 2 people.
	 * 
	 */
	public static void main(String[] args) {

		int [] arr = {1, 2, 5, 3, 7, 8, 6, 4}; // {2, 5, 1, 3, 4}; // {1, 2, 5, 3, 7, 8, 6, 4};
			//{1, 2, 5, 3, 7, 8, 6, 4}; //{1, 2, 5, 3, 4, 7, 8, 6};
		
		int []a = IntStream.range(1, arr.length+1).toArray();
		bribeCalculation(arr);
	}

	public static void bribeCalculation(int []arr) {
		List<Integer> bribeList = new ArrayList<Integer>();
		List<Integer> bribeGiven = new ArrayList<Integer>();
		IntStream.range(1, arr.length+1).forEach( index -> {
			int value = index==1 ? 0:arr[index-2] ;
			bribeList.add( (arr[index-1] - value) <= 1 ? 0 : (arr[index-1] - value));
			bribeGiven.add( (arr[index-1] - index) < 0 ? 0  :  (arr[index-1] - index));
			
//			bribeGiven.add( (arr[index-1] - index) < 0 ? 
//								( (index != arr.length && arr[index-1] > arr[index] ) ? -1*(arr[index-1] - index)  : 0 ) 
//							: (arr[index-1] - index));
			  			
		});
		System.out.println("bribeGiven: "+bribeGiven);
		System.out.println("bribeList : "+bribeList);
		int totalBribe = bribeGiven.stream().mapToInt(Integer::intValue).sum();
		int maxBribe = Collections.max(bribeGiven);
		
		if(maxBribe > 2) {
            System.out.println("Too chaotic");
        }else {
            System.out.println(totalBribe);
        }
		
	}
}
