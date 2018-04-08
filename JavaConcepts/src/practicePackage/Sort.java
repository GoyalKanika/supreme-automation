package practicePackage;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
		int ascArray[] = {2,67,34,23,45,35345,24,1};
		int[] subArray = {23,67,2,4,1,34,109};
		Integer[] descArray = {2,45,34,365,34,3545};
		//****************Sorting in ascending order*****************//
			Arrays.sort(ascArray);
			System.out.println("Array sort in ascending order "+ Arrays.toString(ascArray));
			
		//*****************Sort a subarray of a Array*******************// sorts from 1st till next 3 elements
			
			Arrays.sort(subArray,1,5);
			System.out.println("SubArray ascending sort "+ Arrays.toString(subArray));
			
			
		//*************Sorting in descending order***************//
			Arrays.sort(descArray, Collections.reverseOrder());
			System.out.println("Array sort in descending order"+ Arrays.toString(descArray));
 	}

}
