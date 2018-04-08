package practicePackage;

import java.util.Scanner;

public class PrimeNuber {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int num = input.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i<=num/2;i++){
			
			int temp = num%i;
			if(temp ==0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
		System.out.println("Number is prime "+ num);
		}
		else{
			System.out.println("Number is not prime "+ num);
	}
	
		}
	}
