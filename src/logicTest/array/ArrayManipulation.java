package logicTest.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 
 * Array Manipulation
n = 10

	a b k
    1 5 3
    4 8 7
    6 9 1
    
    Add the values of k between the indices a and b inclusive:


n-> 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]
	
	The largest value is 10  after all operations are performed.


 */
public class ArrayManipulation {

	public static void main(String[] args) {
		int [][]arr = {
				{1, 5, 3},
			    {4, 8, 7},
			    {6, 9, 1}
		};
		
	 System.out.println(solution(arr, 10) );
		
	}
	

    public static long solution(int [][]arr, int n ) {
        long []data = new long[n];
        IntStream.range(0, arr.length).forEach(codinateX->{
            int range1 = arr[codinateX][0] -1;
            int range2 = arr[codinateX][1];
            int maxSum=0, sum=0 ;
            IntStream.range(range1, range2).forEach(codinate->{
                data[codinate] = data[codinate] + arr[codinateX][2];
            });
        });
        
        return Arrays.stream(data).max().getAsLong();
    }
    

}
