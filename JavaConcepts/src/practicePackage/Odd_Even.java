package practicePackage;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		System.out.println("Enter the counter");
		int count = input.nextInt();
		
		if(num%2 == 0){
			System.out.println("Number is even: "+num);
			System.out.println("Other even numbers in the list are:");
			for (int i =1;i<=count;i++){
				int temp = i%2;
				if(temp ==0)
				System.out.print("\t "+i);
		}
		}
		else{
			System.out.println("\n");
			System.out.println("Number is odd: "+num);
			System.out.println("Other odd numbers in the list are:");
			for(int i =1 ;i< count;i++){
				int temp = i%2;
				if(temp !=0){
					System.out.print("\t"+i);
				}
		}
		}
		
		
		
	}
}