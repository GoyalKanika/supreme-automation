package practicePackage;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class GreatestSmallest {

	public static void main(String[] args) {
		int num[] = {12,45,2343,245,9,0133};
		
		/*
		 ///////////////////////////Approach 1//////////////////////////////////////// 
		 IntSummaryStatistics stat = Arrays.stream(num).summaryStatistics();
		int min = stat.getMax();
		int max = stat.getMin();
		double arg = stat.getAverage();
		long count = stat.getSum();
		
		System.out.println("min: " +min+ " |max: "+ max+" |arg: "+ arg+" |count " + count);
		
*/
///////////////////////////Approach 2////////////////////////////////////////
		Arrays.sort(num);
		int min = num[0];
		int max = num[num.length-1];
		System.out.println("min: "+min+ "| max: "+max);
		
///////////////////////////Approach 3////////////////////////////////////////
		/*Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Number: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int greatest;
		
		if(a>=b && a >=c){
			greatest = a;
			System.out.println("Greatest number is " +greatest);
		}
		
		else if(b>=a && b>=c){
			greatest = b;
			System.out.println("Greatest number is " +greatest);
		}
		
		else{
			greatest = c;
			System.out.println("Greatest number" +greatest);
		}
		*/
		
	}

}
