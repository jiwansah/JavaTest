package logicTest.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0


2 4 4
x 2 x
1 2 4

Ans:  19
*/

public class ArraySum2D {

	// ans will be 13
	static int [][] arr = 
		{
			{1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{1, 1, 1, 0, 0, 0},
			{0, 9, 2, -4, -4, 0},
			{0, 0, 0, -2, 0, 0},
			{0, 0, -1, -2, -4, 0},
		};
	
	public static void main(String args[]) {
		solution3();
	}
	
	public static void solution3() {
		
		/// we need -2 because we need 3 X array 
		int codinateLength = arr.length -2;
		List<Integer> sumList = new ArrayList<Integer>(codinateLength*2);
		IntStream.range(0, codinateLength).forEach( codinateX -> {
			IntStream.range(0, codinateLength).forEach( codinateY -> {
				sumList.add(0);
				int index = sumList.size()-1;
				// Cols (x) for Array
			    IntStream.range(codinateX, codinateX+3).forEach( x -> {
			        // Rows (Y)
			        IntStream.range(codinateY, codinateY+3).forEach( y -> {
			        	if( !( (x == codinateX+1 && y == codinateY+0) || (x == codinateX+1 && y == codinateY+2)) ) {
			        		sumList.set(index, sumList.get(index)+ arr[x][y]);
			        	}
			        	
			        	System.out.print( arr[x][y] + " ");
			        });
			        System.out.println("");

			    });
			    
			    System.out.println("-----------------:" + sumList.get(codinateX+codinateY));
			});
		});
		
		System.out.println( Collections.max(sumList) );
	}
	
	
	public static void solution2(){
		
		int arrayLength = arr.length;
		List<Integer> sumList = new ArrayList<Integer>();
		
		for(int x=0; x < arrayLength-2 ; x++) {
			for(int y=0; y < arrayLength-2 ; y++) {
				sumList.add( getSumFor3X3(x, y) );
			}
		}
		int max = Collections.max(sumList);
        System.out.println(max);
		//return max;
	}
	public static int getSumFor3X3(int codinateX, int codinateY){
		
		int sum =0;
        for(int i=codinateX; i< codinateX+3; i++) {
            for(int j=codinateY; j< codinateY+3; j++) {
                sum = sum + arr[i][j];
            }
        }
        sum = sum - arr[codinateX+1][codinateY+0] - arr[codinateX+1][codinateY+2];
        return sum;
	}
	
	public static void solution1() {
		display(arr);
		
		List<Integer> sumList = new ArrayList<Integer>();
        for(int x=0; x< 4; x++) {
            for(int y=0; y< 4; y++) {
               int sum = getSum( devideArray3X3(arr, x, y) );
               sumList.add(sum);
            }
        }
        System.out.println( Collections.max(sumList) );
	}
	
	 public static int[][] devideArray3X3(int[][] arr, int x, int y){
	        int [][] array3box = new int [3][3];
	        for(int i=0; i<3; i++) {
	            for(int j=0; j<3; j++) {
	                array3box[i][j] = arr[i+x][j+y];
	            }
	        }
	        return array3box;
	    }
	    
	    
	    public static int getSum(int[][] data) {
	    	
	    	display(data);
			
			int sum =0;
	        for(int i=0; i<3; i++) {
	            for(int j=0; j<3; j++) {
	                sum = sum + data[i][j];
	            }
	        }
	        sum = sum - data[1][0] - data[1][2];
	        return sum;
	    }

	    public static void display(int [][]data) {
	    	System.out.println("");
	    	for(int []d: data) {
	    		for(int a: d) {
	    			System.out.print(a+" ");
	    		}
	    		System.out.println("");
	    	}
	    	System.out.print("------------------");
	    }
}
