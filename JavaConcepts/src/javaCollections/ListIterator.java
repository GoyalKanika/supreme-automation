package javaCollections;

import java.util.*;

public class ListIterator {


	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Kanika");
		al.add("Alka");
		al.add("Kirti");
		al.add(3,"Suman");
		al.add(1,"Sheela");
		
		for(String as: al){
		System.out.println("Element's position : " +as);
	}
	}
}
