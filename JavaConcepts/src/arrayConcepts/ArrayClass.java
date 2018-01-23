package arrayConcepts;
import java.util.*;

public class ArrayClass {

	static int[] intlength1 = {100,123,98};
	static int[] intlength2 = {101,57,97};
	static String[] stringlength1 = {"audi","bmw","merc"};
	
	public static void main(String[] args) {
	int len = intlength1.length;
	System.out.println("Array lenght is:" +len);
	System.out.println("Without sorting-->");
	for(int i=0;i<len;i++){
		
		System.out.print( "\t" +intlength1[i]);
	}
	System.out.println("");
	Arrays.sort(intlength1);
	System.out.println("After sorting-->");
	for(int i=0;i<len;i++){		
		System.out.print( "\t" +intlength1[i]);
	}
	
	// To verify copy functionality. Run this after commenting the above code,
	System.out.println("");
	System.arraycopy(intlength1, 1, intlength2, 2, 1);
	for(int i=0;i<intlength2.length;i++){	
	System.out.print("\t" +intlength2[i]);
	}
	}
}