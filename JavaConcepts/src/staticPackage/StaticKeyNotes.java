package staticPackage;

public class StaticKeyNotes {

	int addNu=10;
	//Static method cannot access non-static ariables and methods
	public static void main(String[] args) {
		//int output = sum(20); 
		/*If method sum is not static, then this line of
		code will throw error.
		* But if we still wish to use sum method in our main method, then 
		* we need to create object like shown below
		*/
		StaticKeyNotes s2 = new StaticKeyNotes();
		int output = s2.sum(20);
		System.out.println(output);
	}
	
	public int sum(int sum){
		return sum+addNu;
	}

}
