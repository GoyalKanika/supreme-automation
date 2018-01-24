package arrayConcepts;
//https://www.tutorialspoint.com/java/util/
import java.util.*;
public class ArrayFunctions {
	
	 static int[] intfunc1 = {1,8,9,65,41};
	 static int[] intfunc2 = {1,8,19,65,41};
	 static String[] strfunc = {"as","ad","er","wqe","asdd"};
	
	public static void checkEqualsFunctionality(){
		if(Arrays.equals(intfunc1, intfunc2))
			System.out.println("It matches");
		
		else
			System.out.println("No it does not");
		}
	public static void checktoStringFunct(){
		System.out.println("Arrays is: ");
		for(int number :intfunc1){
			System.out.println("at index: "+number);
		}
		System.out.println("Array after .tostring is: ");
		
		System.out.println("At index: "+ Arrays.toString(intfunc1));
	}
	
	public static void checkFillFunctionality(){
		 Arrays.fill(intfunc1, 10);
		 System.out.println("Arrays.Fills fills all the values in intfunc1 by : " +Arrays.toString(intfunc1));
	}
	public static void main(String[] args) {
		checkEqualsFunctionality();
		checktoStringFunct();
		checkFillFunctionality();
		
	}
}
