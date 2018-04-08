package practicePackage;

public class FibonacciSeries {
	public static void main(String args[]){
		//Fiboacci series
		int a =0; int b =1, n=10;
		if(n == 0){
			System.out.println("n is "+n);
			System.out.println(a);
		}
		else{
		System.out.println(a);
		System.out.println(b);
		for(int j=2;j<=n;j++){
			
			int sum = a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
		}
		
	}

}
