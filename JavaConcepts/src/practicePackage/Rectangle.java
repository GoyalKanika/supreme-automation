package practicePackage;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		float height = input.nextFloat();
		float width = input.nextFloat();
		double Area = width*height;
		double perimeter = 2*(width+height);
		
		System.out.println("Area is :" +Area + "Perimeter is:  " +perimeter);
		}
}