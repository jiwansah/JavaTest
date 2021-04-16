package logicTest.array;

import java.util.stream.IntStream;

public class MinimumSwaps {

	static int count =0;
	public static void main(String[] args) {

		int []arr = {7, 1, 3, 2, 4, 5, 6};
		solution(arr);
		for(int data: arr)
			System.out.print(data+", ");
		System.out.println("");
		System.out.println(count);
	}

	public static void solution(int []arr) {
		IntStream.range(0, arr.length).forEach(index -> {
			IntStream.range(index+1, arr.length).forEach(index2 -> {
				if (arr[index] != index+1) {
					swap(arr, index, arr[index]-1);
				}
			});
		});
	}
	
	public static void swap(int[]arr, int i, int j) {
		int data = arr[i];
		arr[i] = arr[j];
		arr[j] = data;
		count++;
	}
}
